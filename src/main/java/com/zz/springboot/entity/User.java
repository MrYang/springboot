package com.zz.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User extends BaseEntity {

    private static final long serialVersionUID = 5896616485138744415L;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
