package com.paulprojects.booapp.dao;
import com.paulprojects.booapp.model.Location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationDAO extends JpaRepository<Location, Long> {
}
