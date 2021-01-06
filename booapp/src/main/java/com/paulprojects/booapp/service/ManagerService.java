package com.paulprojects.booapp.service;

import com.paulprojects.booapp.dao.UserDAO;
import com.paulprojects.booapp.model.User;
import com.paulprojects.booapp.transformer.ManagerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {
    @Autowired
    private UserDAO userDAO;

    @Autowired
    private ManagerTransformer managerTransformer;

    public User getManager(){
        User manager = userDAO.findUserByUsername("Silviu");
        return manager;
    }


}
