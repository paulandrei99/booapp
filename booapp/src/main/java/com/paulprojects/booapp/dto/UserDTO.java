package com.paulprojects.booapp.dto;



import com.paulprojects.booapp.model.Role;

import javax.annotation.ManagedBean;
import java.util.Set;

@ManagedBean
public class UserDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String username;

    private String password;

    private String phone;

    private String email;

    private int age;

    private int active;

    private Set<Role> roles;

//    public UserDTO(Long id, String firstName, String lastName, String username, String password, String phone, String email, int age, int active, Set<Role> roles) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.username = username;
//        this.password = password;
//        this.phone = phone;
//        this.email = email;
//        this.age = age;
//        this.active = active;
//        this.roles = roles;
//    }

    public UserDTO() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}