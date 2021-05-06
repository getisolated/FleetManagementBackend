package com.javainuse.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.javainuse.model.UserHasRole;

import java.util.List;

@Repository
public interface RoleIO extends CrudRepository<UserHasRole, Integer> {
    List<UserHasRole> findByIdUser(Integer idUser);
}
