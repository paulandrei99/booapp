package com.paulprojects.booapp.controller;

import com.paulprojects.booapp.dao.UserDAO;
import com.paulprojects.booapp.dto.ManagerDTO;
import com.paulprojects.booapp.dto.UserDTO;
import com.paulprojects.booapp.model.Manager;
import com.paulprojects.booapp.model.User;
import com.paulprojects.booapp.service.ManagerService;
import com.paulprojects.booapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.paulprojects.booapp.service.ManagerService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("user/addUser")
    public ResponseEntity addUser(@RequestBody UserDTO userDTO){
        userService.addUser(userDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("user/getAllUsers")
    public ResponseEntity getAllUsers(@RequestBody UserDTO userDTO){
        List<UserDTO> userDTOList = userService.getUsers();
        return ResponseEntity.ok(userDTOList);
    }

    @GetMapping("user/getUsersByAge")
    public ResponseEntity getUsersById(@RequestBody UserDTO userDTO) {
        List<UserDTO> userDTOList = userService.getUsersByAge();
        return ResponseEntity.ok(userDTOList);
    }
}
