package com.paulprojects.booapp.model.menu;

import com.sun.org.apache.xerces.internal.impl.dv.xs.BaseDVFactory;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany
    private List<MenuCategory> menuCategories = new ArrayList<>();

    public Menu() {
    }

}
