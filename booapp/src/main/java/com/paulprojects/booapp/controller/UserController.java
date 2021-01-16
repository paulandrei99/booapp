package com.paulprojects.booapp.controller;

import com.paulprojects.booapp.dao.UserDAO;
import com.paulprojects.booapp.dto.UserDTO;
import com.paulprojects.booapp.model.User;
import com.paulprojects.booapp.service.ManagerService;
import com.paulprojects.booapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private ManagerService managerService;
    @Autowired
    private UserDAO userDAO;

    @PostMapping("/user/addUser")
    public ResponseEntity addUser(@RequestBody UserDTO userDTO){
        userService.addUser(userDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/user/getAllUsers")
    public List<User> users(){
        return (List<User>) userDAO.findAll();
    }

//    @GetMapping("user/getUsersByAge")
//    public ResponseEntity getUsersByAge(@RequestBody UserDTO userDTO) {
//        List<UserDTO> userDTOList = userService.getUsersByAge();
//        return ResponseEntity.ok(userDTOList);
//    }


    @RequestMapping(value="/user/getUserByAge/{age}", method = RequestMethod.GET)
    public ResponseEntity getUsersByAge(@PathVariable("age") int age){
        List <UserDTO> result_user = userService.getUsersByAge(age);
        return ResponseEntity.ok(result_user);
    }

    //Sends response with manager object which has the given username
    @GetMapping("user/managers")
    public ResponseEntity getManagers(){
        User user = managerService.getManager();
        return ResponseEntity.ok(user);
    }

}
