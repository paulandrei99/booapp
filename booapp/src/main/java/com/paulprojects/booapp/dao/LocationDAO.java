package com.paulprojects.booapp.dao;

import com.paulprojects.booapp.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LocationDAO extends JpaRepository<Location, Long> {
    List<Location> findLocationByCounty(String county_name);
    List<Location> findLocationByCity(String city);

    //@Query("SELECT p FROM Location p WHERE LOWER(p.cityName) = LOWER(:city_name)")
    //List<Location> find(@Param("city_name") String city_name);
}
