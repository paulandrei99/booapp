package com.paulprojects.booapp.dao.menu;

import com.paulprojects.booapp.model.menu.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuItemDAO extends JpaRepository<MenuItem, Long> {
}
