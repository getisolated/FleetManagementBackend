package com.javainuse.model;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    private int id;
    @Column
    private String name;
    @Column
    private Boolean active;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
