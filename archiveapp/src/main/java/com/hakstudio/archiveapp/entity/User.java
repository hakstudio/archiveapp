package com.hakstudio.archiveapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long tc;
    private String name;
    private String surname;
    private int accessAuth;
    private boolean hideCreator;
    private String createdBy;
    private int createdByTc;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTc() {
        return tc;
    }

    public void setTc(long tc) {
        this.tc = tc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAccessAuth() {
        return accessAuth;
    }

    public void setAccessAuth(int accessAuth) {
        this.accessAuth = accessAuth;
    }

    public boolean isHideCreator() {
        return hideCreator;
    }

    public void setHideCreator(boolean hideCreator) {
        this.hideCreator = hideCreator;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public int getCreatedByTc() {
        return createdByTc;
    }

    public void setCreatedByTc(int createdByTc) {
        this.createdByTc = createdByTc;
    }
}
