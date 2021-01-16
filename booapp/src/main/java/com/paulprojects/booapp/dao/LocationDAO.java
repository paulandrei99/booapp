package com.paulprojects.booapp.dao;
import com.paulprojects.booapp.model.Location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationDAO extends JpaRepository<Location, Long> {
    List<Location> findLocationByCounty(String county);
    List<Location> findLocationByCity(String city);
    List<Location> findLocationByCountyAndCity(String County, String city);
}
