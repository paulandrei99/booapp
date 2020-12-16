package com.paulprojects.booapp.transformer;

import com.paulprojects.booapp.dto.UserDTO;
import com.paulprojects.booapp.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserTransformer {

    public User convertDTOToModel(UserDTO userDTO){
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        return user;
    }

    public UserDTO convertModelToDTO(User user){
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }


}
