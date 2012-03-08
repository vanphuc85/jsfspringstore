package com.jsfsample.services;

import java.util.List;
import javax.annotation.security.RolesAllowed;

import com.jsfsample.model.Bike;

public interface BikeDataProvider {

	public abstract List<Bike> getBikesByCategory(Integer categoryId,
			boolean onlyWithDiscount);

	@RolesAllowed({"ROLE_ADMIN","ROLE_REGISTERED"})	
	public abstract Bike getBikeById(Integer id);

	public abstract void add(Bike newBike, Integer categoryId);

}