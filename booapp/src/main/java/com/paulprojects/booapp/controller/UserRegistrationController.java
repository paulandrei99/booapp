package com.paulprojects.booapp.controller;

import com.paulprojects.booapp.dto.UserDTO;
import com.paulprojects.booapp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;

    public UserRegistrationController(UserService userService){
        super();
        this.userService = userService;
    }

    public String registerUserAccount(@ModelAttribute("user")UserDTO userDTO){
        userService.save(userDTO);
        return "redirect:/registration?succes";
    }

}
