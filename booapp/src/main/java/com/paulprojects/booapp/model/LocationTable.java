package com.paulprojects.booapp.model;

import com.paulprojects.booapp.model.menu.MenuItem;
//
import javax.persistence.*;
import java.util.List;

@Entity
public class LocationTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private byte seats;

    @OneToOne
    private User currentClient;

    @OneToOne
    private User currentEmployee;

    public LocationTable() {
    }



}
