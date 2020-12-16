package com.paulprojects.booapp.dao.menu;

import com.paulprojects.booapp.model.menu.MenuCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuCategoryDAO extends JpaRepository<MenuCategory, Long> {
}
