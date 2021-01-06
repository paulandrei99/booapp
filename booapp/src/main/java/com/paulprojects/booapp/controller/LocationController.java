package com.paulprojects.booapp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.paulprojects.booapp.dto.LocationDTO;
import com.paulprojects.booapp.dto.UserDTO;
import com.paulprojects.booapp.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

//    @PostMapping("location/addLocation")
//    public ResponseEntity addLocation(@RequestBody LocationDTO locationDTO){
//        locationService.addLocation(locationDTO);
//        return ResponseEntity.ok(HttpStatus.OK);
//    }

    @PostMapping("location/addLocation")
    public ResponseEntity addLocation(@RequestBody Map<String,String> allParams){
        System.out.println("Parameters are " + allParams.entrySet());
//        locationService.addLocation(locationDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }


    //returns a json with the list of the locations from the county selected
    //@GetMapping("location/")
    @RequestMapping(value="/data/{county_name}", method = RequestMethod.GET)
    public  ResponseEntity getLocationListFrom(@PathVariable("county_name") String county_name){
        List <LocationDTO> result_locations = locationService.getLocationByCounty(county_name);
        return ResponseEntity.ok(result_locations);
    }


}
