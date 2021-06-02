package com.javainuse.controller;

import com.javainuse.config.JwtRequestFilter;
import com.javainuse.dao.RoleIO;
import com.javainuse.dao.UserIO;
import com.javainuse.frontModel.User.UserModel;
import com.javainuse.model.User;
import com.javainuse.model.UserHasRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.javainuse.config.JwtTokenUtil;
import com.javainuse.model.JwtRequest;
import com.javainuse.model.AuthModel;
import com.javainuse.service.JwtUserDetailsService;

import java.util.List;

@RestController
@CrossOrigin
public class JwtAuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private JwtUserDetailsService userDetailsService;

	@Autowired
	private JwtRequestFilter requestFilter;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {

		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());

		final String authToken = jwtTokenUtil.generateToken(userDetails);

		return ResponseEntity.ok(new AuthModel(authToken));
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody com.javainuse.model.User user) {
		return ResponseEntity.ok(userDetailsService.save(user));
	}


	@Autowired
	private UserIO userIO;

	@Autowired
	private RoleIO roleIO;

	@RequestMapping(value = "/me", method = RequestMethod.GET)
	public ResponseEntity<com.javainuse.frontModel.User.UserModel> getName(@RequestHeader(name = "Authorization") String token) {
		String jwtToken = null;
		jwtToken = token.substring(7);
		String username = jwtTokenUtil.getUsernameFromToken(jwtToken);

		User user = userIO.findByEmail(username);
		List<UserHasRole> userHasRoles = roleIO.findByIdUser(user.getId());
		UserModel userModel = new UserModel(user, userHasRoles);
		return ResponseEntity.ok(userModel);
	}

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ResponseEntity<?> update(@RequestBody UserModel userUpdate) {
		User userUpdated = new User(userUpdate, bcryptEncoder.encode(userUpdate.getPassword()));
		return ResponseEntity.ok(userIO.save(userUpdated));

	}

	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}