package com.paulprojects.booapp.dto;

import javax.annotation.ManagedBean;
import javax.persistence.*;
import java.util.List;

@ManagedBean
public class LocationDTO {

    private Long id;

    private String name;

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
