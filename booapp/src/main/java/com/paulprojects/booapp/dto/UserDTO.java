package com.paulprojects.booapp.dto;

import javax.annotation.ManagedBean;
import java.util.Collection;

@ManagedBean
public class UserDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String password;

    private String phone;

    private String email;

    private int age;

    private int active;

    private Collection roles;


    public UserDTO(Long id, String firstName, String lastName, String password, String phone, String email, int age, int active, Collection roles) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.active = active;
        this.roles = roles;
    }

    public UserDTO() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Collection getRoles() {
        return roles;
    }

    public void setRoles(Collection roles) {
        this.roles = roles;
    }
}