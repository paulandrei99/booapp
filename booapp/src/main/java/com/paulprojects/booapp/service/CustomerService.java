package com.paulprojects.booapp.service;

import com.paulprojects.booapp.dao.UserDAO;
import com.paulprojects.booapp.transformer.CustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private CustomerTransformer customerTransformer;

}
