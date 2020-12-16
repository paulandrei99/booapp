package com.paulprojects.booapp.dao.menu;

import com.paulprojects.booapp.model.menu.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuDAO extends JpaRepository<Menu, Long> {
}
