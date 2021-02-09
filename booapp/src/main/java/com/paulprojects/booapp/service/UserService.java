package com.paulprojects.booapp.service;

import com.paulprojects.booapp.dao.UserDAO;
import com.paulprojects.booapp.dto.UserDTO;
import com.paulprojects.booapp.model.Role;
import com.paulprojects.booapp.model.User;
import com.paulprojects.booapp.transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements UserSvc {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserTransformer userTransformer;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserService(UserDAO userDAO){
        super();
        this.userDAO = userDAO;
    }

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

    @Override
    public User save(UserDTO userDTO){
        User user = new User(userDTO.getFirstName(),
                userDTO.getLastName(),passwordEncoder.encode(userDTO.getPassword()),userDTO.getPhone(), userDTO.getEmail(),userDTO.getAge(),
                Arrays.asList(new Role("ROLE_USER")));
        return userDAO.save(user);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDAO.findByEmail(username);
        if(user == null){
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());

    }
}
