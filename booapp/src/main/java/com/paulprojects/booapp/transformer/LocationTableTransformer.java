package com.paulprojects.booapp.transformer;

import com.paulprojects.booapp.dto.LocationTableDTO;
import com.paulprojects.booapp.model.LocationTable;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class LocationTableTransformer {

    public LocationTable convertDTOToModel(LocationTableDTO locationTableDTO){
        LocationTable locationTable = new LocationTable();
        BeanUtils.copyProperties(locationTableDTO, locationTable);
        return locationTable;
    }

    public LocationTableDTO convertModelToDTO(LocationTable locationTable) {
        LocationTableDTO locationTableDTO = new LocationTableDTO();
        BeanUtils.copyProperties(locationTable, locationTableDTO);
        return locationTableDTO;
    }

}
