package com.javainuse.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserHasRoleKey implements Serializable {
    @Column(name = "user_id")
    Integer user;

    @Column(name = "role_id")
    Integer role;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserHasRoleKey that = (UserHasRoleKey) o;
        return user.equals(that.user) && role.equals(that.role);
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, role);
    }
}
