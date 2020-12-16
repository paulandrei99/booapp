package com.paulprojects.booapp.dto;

import com.paulprojects.booapp.dto.menu.MenuDTO;
import com.paulprojects.booapp.enums.County;
import com.paulprojects.booapp.dto.UserDTO;

import javax.annotation.ManagedBean;
import javax.persistence.*;
import java.util.List;

@ManagedBean
public class LocationDTO {

    private Long id;

    private String name;

    private County county;

    private MenuDTO menu;

    private List<LocationTableDTO> locationTables;

    private List<UserDTO> employees;

    private UserDTO locationOwner;

    public LocationDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public County getCounty() {
        return county;
    }

    public void setCounty(County county) {
        this.county = county;
    }

    public MenuDTO getMenu() {
        return menu;
    }

    public void setMenu(MenuDTO menu) {
        this.menu = menu;
    }

    public List<LocationTableDTO> getLocationTables() {
        return locationTables;
    }

    public void setLocationTables(List<LocationTableDTO> locationTables) {
        this.locationTables = locationTables;
    }

    public List<UserDTO> getEmployees() {
        return employees;
    }

    public void setEmployees(List<UserDTO> employees) {
        this.employees = employees;
    }

    public UserDTO getLocationOwner() {
        return locationOwner;
    }

    public void setLocationOwner(UserDTO locationOwner) {
        this.locationOwner = locationOwner;
    }
}
