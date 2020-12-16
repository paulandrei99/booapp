package com.paulprojects.booapp.dto;

import com.paulprojects.booapp.dto.menu.MenuItemDTO;
import com.paulprojects.booapp.enums.UserRole;
import com.paulprojects.booapp.model.menu.MenuItem;

import javax.annotation.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class UserDTO {


    private Long id;

    private UserRole userRole;

    private String username;

    private String password;

    private String phone;

    private String email;

    private byte age;

    private List<MenuItemDTO> userOrder = new ArrayList<>();

    public UserDTO() {
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

    public List<MenuItemDTO> getUserOrder() {
        return userOrder;
    }

    public void setUserOrder(List<MenuItemDTO> userOrder) {
        this.userOrder = userOrder;
    }
}
