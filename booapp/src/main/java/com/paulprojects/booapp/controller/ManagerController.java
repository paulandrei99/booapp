package com.paulprojects.booapp.controller;

import com.paulprojects.booapp.dto.ManagerDTO;
import com.paulprojects.booapp.model.Location;
import com.paulprojects.booapp.model.Manager;
import com.paulprojects.booapp.service.ManagerService;
import com.paulprojects.booapp.transformer.LocationTransformer;
import com.paulprojects.booapp.transformer.ManagerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManagerController {
    @Autowired
    private ManagerService managerService;
    @Autowired
    private ManagerTransformer managerTransformer;
    @Autowired
    private LocationTransformer locationTransformer;

    //input  : a string with the username of the profile that we want to find
    //output : JSON manager object which has the given username
//    @RequestMapping(value="/managers/{manager_name}", method= RequestMethod.GET)
//    public ResponseEntity getManagers(@PathVariable("manager_name") String manager_name)
//    {
//        Manager manager = managerService.getManagerByUsername(manager_name);
//        ManagerDTO managerDTO = managerTransformer.convertModelToDTO(manager);
//        return ResponseEntity.ok(managerDTO);
//    }

    //input  : string : city name where the location is
    //       : string : county name where the location is
    //       : string : the name of the location
    //output : JSON manager object which has the given username
    @RequestMapping(value="/managers/createLocation/{city}/{county}/{name}",method=RequestMethod.POST)

    public ResponseEntity createLocation(@PathVariable("city") String city ,
                                         @PathVariable("county") String county,
                                         @PathVariable("name") String name)
    {
        //create a new object for location
        Location location = new Location();
        //set the data for the location object from the client
        //!!!TO DO!!! we will also need here the logged user's id
        location.setCity(city); location.setCounty(county); location.setName(name);
        //add the location in the database
        managerService.addLocation(location);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    //input  : int    : the location's id the manager want to edit
    //         string : informations about the location
    //output : JSON manager object which has the given username
    @RequestMapping(value="/managers/editLocation/{locationId}",method=RequestMethod.POST)
    public ResponseEntity editLocation(@PathVariable("locationID") int locationId)
    {

        return ResponseEntity.ok(HttpStatus.OK);
    }

}
