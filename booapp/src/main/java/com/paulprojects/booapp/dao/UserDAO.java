package com.paulprojects.booapp.dao;

import com.paulprojects.booapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
    List<User> findByAge(long age);
    
}
