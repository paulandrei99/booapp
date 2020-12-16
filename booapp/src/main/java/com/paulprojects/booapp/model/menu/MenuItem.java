package com.paulprojects.booapp.model.menu;

import javax.persistence.*;

@Entity
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private short price;

    @Column
    private String description;

    public MenuItem() {
    }

}
