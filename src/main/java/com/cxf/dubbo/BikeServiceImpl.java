package com.cxf.dubbo;

import java.util.Arrays;
import java.util.List;

import com.cxf.dubbo.entities.Bike;
import com.cxf.dubbo.service.BikeService;

public class BikeServiceImpl implements BikeService
{

	@Override
	public List<Bike> qryAllBike()
	{
		return Arrays.asList(new Bike(1,"AA"),new Bike(2,"BB"));
	}

}
