package com.paulprojects.booapp.service;

import com.paulprojects.booapp.dao.LocationDAO;
import com.paulprojects.booapp.dto.LocationDTO;
import com.paulprojects.booapp.dto.UserDTO;
import com.paulprojects.booapp.model.Location;
import com.paulprojects.booapp.transformer.LocationTransformer;
import com.paulprojects.booapp.transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {

    @Autowired
    private LocationDAO locationDAO;

    @Autowired
    private LocationTransformer locationTransformer;

    @Autowired
    private UserTransformer userTransformer;

    public void addLocation(LocationDTO locationDTO){
        Location location = locationTransformer.convertDTOToModel(locationDTO);
        locationDAO.save(location);
    }

    public List<LocationDTO> getLocation(){
        List<Location> locationList = locationDAO.findAll();
        List<LocationDTO> locationDTOList = new ArrayList<>();
        for (Location location : locationList) {
            LocationDTO locationDTO = locationTransformer.convertModelToDTO(location);
            locationDTOList.add(locationDTO);
        }
        return locationDTOList;
    }

    //output: a list of LocationDTO objects
    //input : which have the county_name given
    public List<LocationDTO> getLocationByCounty(String county){
        List <Location> locationList = locationDAO.findLocationByCounty(county);
        List <LocationDTO> locationDTOList = new ArrayList<>();
        for(Location location : locationList){
            LocationDTO locationDTO = locationTransformer.convertModelToDTO(location);
            locationDTOList.add(locationDTO);
        }
        return locationDTOList;
    }

    public List<LocationDTO> getLocationByCity(String city){
        List <Location> locationList = locationDAO.findLocationByCity(city);
        List <LocationDTO> locationDTOList = new ArrayList<>();
        for(Location location : locationList){
            LocationDTO locationDTO = locationTransformer.convertModelToDTO(location);
            locationDTOList.add(locationDTO);
        }
        return locationDTOList;
    }

    public List<LocationDTO> getLocationByCountyAndCity(String county, String city){
        List <Location> locationList = locationDAO.findLocationByCountyAndCity(county, city);
        List <LocationDTO> locationDTOList = new ArrayList<>();
        for(Location location : locationList){
            LocationDTO locationDTO = locationTransformer.convertModelToDTO(location);
            locationDTOList.add(locationDTO);
        }
        return locationDTOList;
    }





}
