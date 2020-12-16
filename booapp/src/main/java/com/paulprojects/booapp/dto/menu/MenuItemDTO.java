package com.paulprojects.booapp.dto.menu;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class MenuItemDTO {

    private Long id;

    private String name;

    private short price;

    private String description;

    public MenuItemDTO() {
    }

}
