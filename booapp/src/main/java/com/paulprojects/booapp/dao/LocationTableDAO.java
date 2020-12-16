package com.paulprojects.booapp.dao;

import com.paulprojects.booapp.model.LocationTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationTableDAO extends JpaRepository<LocationTable, Long> {

}
