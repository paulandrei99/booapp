package com.paulprojects.booapp.service;

import com.paulprojects.booapp.dao.UserDAO;
import com.paulprojects.booapp.dto.UserDTO;
import com.paulprojects.booapp.model.Role;
import com.paulprojects.booapp.model.User;
import com.paulprojects.booapp.transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserTransformer userTransformer;

    public void addUser(UserDTO userDTO){
        User user = userTransformer.convertDTOToModel(userDTO);
        userDAO.save(user);
    }

    public List<UserDTO> getUsers(){
        List<User> userList = userDAO.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for (User user : userList) {
            UserDTO userDTO = userTransformer.convertModelToDTO(user);
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }


    public List<UserDTO> getUsersByAge(int age){
        List<User> userList = userDAO.findUserByAge(age);
        List<UserDTO> userDTOList = new ArrayList<>();
        for (User user : userList) {
            UserDTO userDTO = userTransformer.convertModelToDTO(user);
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }

    public UserService(UserDAO userDAO){
        super();
        this.userDAO = userDAO;
    }

    public User save(UserDTO userDTO){
        User user = new User(userDTO.getFirstName(),
                userDTO.getLastName(), userDTO.getEmail(),
                userDTO.getAge(), userDTO.getPassword(),
                userDTO.getPhone(), userDTO.getUsername(),
                Arrays.asList(new Role("USER")));
        return userDAO.save(user);
    }








}
