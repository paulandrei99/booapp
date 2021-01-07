package com.paulprojects.booapp.transformer;

import com.paulprojects.booapp.dto.LocationDTO;
import com.paulprojects.booapp.model.Location;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class LocationTransformer {

    public Location convertDTOToModel(LocationDTO locationDTO){
        Location location = new Location();
        BeanUtils.copyProperties(locationDTO, location);
        return location;
    }

    public LocationDTO convertModelToDTO(Location location) {
        LocationDTO locationDTO = new LocationDTO();
        BeanUtils.copyProperties(location, locationDTO);
        return locationDTO;
    }

}
