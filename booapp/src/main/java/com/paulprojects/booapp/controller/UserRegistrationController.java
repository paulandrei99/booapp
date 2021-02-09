package com.paulprojects.booapp.controller;

        import com.paulprojects.booapp.dto.UserDTO;
        import com.paulprojects.booapp.service.UserService;
        import com.paulprojects.booapp.service.UserSvc;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.ModelAttribute;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserSvc userSvc;

    public UserRegistrationController(UserSvc userSvc){
        super();
        this.userSvc = userSvc;
    }

    @ModelAttribute("user")
    public UserDTO userDTO(){
        return new UserDTO();
    }

    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user")UserDTO userDTO){
        userSvc.save(userDTO);
        return "redirect:/registration?success";
    }



}
