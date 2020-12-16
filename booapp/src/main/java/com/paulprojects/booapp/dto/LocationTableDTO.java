package com.paulprojects.booapp.dto;

import com.paulprojects.booapp.model.User;

import javax.persistence.*;

public class LocationTableDTO {


    private Long id;

    private byte seats;

    private UserDTO currentClient;

    private UserDTO currentEmployee;

    public LocationTableDTO() {
    }

}
