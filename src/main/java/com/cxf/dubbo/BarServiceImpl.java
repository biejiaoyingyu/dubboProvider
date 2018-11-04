package com.cxf.dubbo;

import com.cxf.dubbo.entities.Bike;
import com.cxf.inteface.BarService;

public class BarServiceImpl implements BarService{
    @Override
    public Bike getOneBike(Integer id) {
        return new Bike(6,"generic");
    }
}
