package com.paulprojects.booapp.model;

import javax.persistence.*;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User userBooked;

    @ManyToOne
    private Location locationBooked;

    public Booking(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUserBooked() {
        return userBooked;
    }

    public void setUserBooked(User userBooked) {
        this.userBooked = userBooked;
    }

    public Location getLocationBooked() {
        return locationBooked;
    }

    public void setLocationBooked(Location locationBooked) {
        this.locationBooked = locationBooked;
    }



}
