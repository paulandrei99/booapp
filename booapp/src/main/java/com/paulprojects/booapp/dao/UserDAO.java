package com.paulprojects.booapp.dao;

import com.paulprojects.booapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
//    List<User> findUserByAge(long age);
    List<User> findUserByAge(int age);
    Optional<User> findUserByUsername(String username);
//    User findUserByUsernameAndFlag(String username,int flag);

}
