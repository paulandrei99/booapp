package com.paulprojects.booapp.model;

import com.paulprojects.booapp.enums.UserRole;
import com.paulprojects.booapp.model.menu.MenuItem;


import javax.persistence.*;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private byte age;

//    @OneToMany(cascade = CascadeType.ALL)
//    private List<MenuItem> userOrder = new ArrayList<>();

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
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

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

//    public List<MenuItem> getUserOrder() {
//        return userOrder;
//    }
//
//    public void setUserOrder(List<MenuItem> userOrder) {
//        this.userOrder = userOrder;
//    }
}
