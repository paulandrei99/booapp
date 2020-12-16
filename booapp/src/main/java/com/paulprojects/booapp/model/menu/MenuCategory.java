package com.paulprojects.booapp.model.menu;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MenuCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    //Warning!
    @OneToMany
    private List<MenuItem> categoryItems = new ArrayList<>();

    public MenuCategory() {
    }

}
