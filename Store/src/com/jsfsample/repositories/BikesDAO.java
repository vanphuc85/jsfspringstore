package com.jsfsample.repositories;

import java.util.List;

import com.jsfsample.model.Bike;

public interface BikesDAO {
	
	public Bike loadSelectedBike(Integer bikeId);
	public List<Bike> loadBikesFromCategory(Integer categoryId, boolean onlyWithDiscount);
	public void saveBike(Bike newBike);

}
