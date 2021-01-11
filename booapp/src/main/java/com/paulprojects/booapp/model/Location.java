package com.paulprojects.booapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String county;

    @Column
    private String city;

    @OneToMany
    private List<User> employees;

    //in loc sa trimitem user putem usura treaba facand din "user locationOwner" in "int locationOwner"
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

    public String getCounty(){ return county; }

    public void setCounty(String p_county) {this.county = p_county;}

    public String getCity() { return city; }

    public void setCity(String p_city_name) { city = p_city_name; }
}
