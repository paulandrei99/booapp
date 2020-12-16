package com.paulprojects.booapp.dto.menu;

import com.paulprojects.booapp.model.menu.MenuItem;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class MenuCategoryDTO {

    private Long id;

    private String name;

    //Warning!
    private List<MenuItemDTO> categoryItems = new ArrayList<>();

    public MenuCategoryDTO() {
    }

}
