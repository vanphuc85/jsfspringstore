package com.jsfsample.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.jsfsample.model.Bike;
import com.jsfsample.services.BikeDataProvider;

@ManagedBean(name="bikeDetails")
@RequestScoped
public class BikeDetails {

	private Integer bikeId;
	private Bike bike;	
	
	@ManagedProperty("#{bikeDataProvider}")
	private BikeDataProvider bikeDataProvider; // injected Spring defined service for bikes

	public void loadBike(){
		bike = bikeDataProvider.getBikeById(bikeId);
	}
	
	public Integer getBikeId() {
		return bikeId;
	}

	public void setBikeId(Integer bikeId) {
		this.bikeId = bikeId;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBikeDataProvider(BikeDataProvider bikeDataProvider) {
		this.bikeDataProvider = bikeDataProvider;
	}
	
	
	
}
