package com.paulprojects.booapp.dao;

import com.paulprojects.booapp.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDAO extends JpaRepository<Booking, Long> {

}
