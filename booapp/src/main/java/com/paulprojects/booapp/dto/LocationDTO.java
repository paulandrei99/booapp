package com.paulprojects.booapp.dto;

import javax.annotation.ManagedBean;
import java.util.List;

@ManagedBean
public class LocationDTO {

    private Long id;

    private String type;

    private String name;

    private UserDTO locationOwner;

    private String county;

    private String city;

    private int bookingCapacity;

    private String about;

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

    public UserDTO getLocationOwner() {
        return locationOwner;
    }

    public void setLocationOwner(UserDTO locationOwner) {
        this.locationOwner = locationOwner;
    }

    public String getCounty(){ return county; }

    public void setCounty(String p_county) {this.county = p_county;}

    public String getCity() { return city; }

    public void setCity(String p_city_name) { city = p_city_name; }

    public int getBookingCapacity() {
        return bookingCapacity;
    }

    public void setBookingCapacity(int bookingCapacity) {
        this.bookingCapacity = bookingCapacity;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
