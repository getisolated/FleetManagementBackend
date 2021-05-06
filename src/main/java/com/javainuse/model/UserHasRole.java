package com.javainuse.model;

import javax.persistence.*;

@Entity
@Table(name = "user_has_role")
public class UserHasRole {
    @EmbeddedId
    private UserHasRoleKey id;

    public UserHasRoleKey getId() {
        return id;
    }

    public void setId(UserHasRoleKey id) {
        this.id = id;
    }
}
