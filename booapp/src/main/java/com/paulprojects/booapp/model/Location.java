package com.paulprojects.booapp.model;

import com.paulprojects.booapp.enums.County;
import com.paulprojects.booapp.model.menu.Menu;

import javax.persistence.*;
import java.util.List;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    private County county;

    @OneToOne
    private Menu menu;

    @OneToMany
    private List<LocationTable> locationTables;

    @OneToMany
    private List<User> employees;

    @OneToOne
    private User locationOwner;

    public Location() {
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

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<LocationTable> getLocationTables() {
        return locationTables;
    }

    public void setLocationTables(List<LocationTable> locationTables) {
        this.locationTables = locationTables;
    }

    public List<User> getEmployees() {
        return employees;
    }

    public void setEmployees(List<User> employees) {
        this.employees = employees;
    }

    public User getLocationOwner() {
        return locationOwner;
    }

    public void setLocationOwner(User locationOwner) {
        this.locationOwner = locationOwner;
    }
}
