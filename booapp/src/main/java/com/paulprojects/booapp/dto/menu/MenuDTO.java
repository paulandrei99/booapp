package com.paulprojects.booapp.dto.menu;

import com.paulprojects.booapp.model.menu.MenuCategory;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class MenuDTO {

    private Long id;

    private String name;

    private List<MenuCategoryDTO> menuCategories = new ArrayList<>();

    public MenuDTO() {
    }

}
