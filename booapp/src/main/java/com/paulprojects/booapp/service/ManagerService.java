package com.paulprojects.booapp.service;

import com.paulprojects.booapp.dao.LocationDAO;
import com.paulprojects.booapp.dao.UserDAO;
import com.paulprojects.booapp.model.Location;
import com.paulprojects.booapp.model.Manager;
import com.paulprojects.booapp.model.User;
import com.paulprojects.booapp.transformer.ManagerTransformer;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private LocationDAO locationDAO;

    @Autowired
    private ManagerTransformer managerTransformer;

    public Manager getManagerByUsername(String manager_name){
        Manager manager = new Manager();
        User user = userDAO.findUserByUsernameAndFlag(manager_name,1);
        if(user != null)
            BeanUtils.copyProperties(user,manager);//convertim din user in manager
        return manager;
    }

    public void addLocation(Location location) {
        locationDAO.save(location);
        //locationDAO.save(location);
    }

}
