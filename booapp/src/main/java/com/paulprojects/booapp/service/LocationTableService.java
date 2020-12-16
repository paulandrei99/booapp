package com.paulprojects.booapp.service;

import com.paulprojects.booapp.dao.LocationTableDAO;
import com.paulprojects.booapp.dto.LocationTableDTO;
import com.paulprojects.booapp.model.LocationTable;
import com.paulprojects.booapp.transformer.LocationTableTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationTableService {

    @Autowired
    private LocationTableDAO locationTableDAO;

    @Autowired
    private LocationTableTransformer locationTableTransformer;

    public void addLocationTable(LocationTableDTO locationTableDTO){
        LocationTable locationTable = locationTableTransformer.convertDTOToModel(locationTableDTO);
        locationTableDAO.save(locationTable);
    }

    public List<LocationTableDTO> getLocationTable(){
        List<LocationTable> locationTableList = locationTableDAO.findAll();
        List<LocationTableDTO> locationTableDTOList = new ArrayList<>();
        for (LocationTable locationTable : locationTableList) {
            LocationTableDTO locationTableDTO = locationTableTransformer.convertModelToDTO(locationTable);
            locationTableDTOList.add(locationTableDTO);
        }
        return locationTableDTOList;
    }

}
