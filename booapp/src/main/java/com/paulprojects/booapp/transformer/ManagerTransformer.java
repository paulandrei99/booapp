package com.paulprojects.booapp.transformer;

import com.paulprojects.booapp.dto.ManagerDTO;
import com.paulprojects.booapp.dto.UserDTO;
import com.paulprojects.booapp.model.Manager;
import com.paulprojects.booapp.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ManagerTransformer {

    public Manager convertDTOToModel(ManagerDTO managerDTO){
        Manager user = new Manager();
        BeanUtils.copyProperties(managerDTO, user);
        return user;
    }

    public ManagerDTO convertModelToDTO(Manager user){
        ManagerDTO userDTO = new ManagerDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }

}
