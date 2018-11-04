package com.cxf.group;

import com.cxf.dubbo.entities.Bike;
import com.cxf.dubbo.service.BikeService;

import java.util.Arrays;
import java.util.List;

public class BikeServiceImpl implements BikeService{
    @Override
    public List<Bike> qryAllBike() {
        return Arrays.asList(new Bike(3,"cc"),new Bike(4,"dd"));
    }
}
