package com.jsfsample.managedbeans;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.jsfsample.model.Bike;
import com.jsfsample.services.BikeDataProvider;

@ManagedBean(name="bikesListBean")
@SessionScoped
public class BikesList implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8957439343830408210L;

	private Integer categoryId; 
	private List<Bike> bikesList; 
		
	@ManagedProperty("#{bikeDataProvider}")
	private BikeDataProvider bikeDataProvider;

	// loads bikes from required category
	public String getBikes(){		
		bikesList = bikeDataProvider.getBikesByCategory(categoryId, false);
		return "bikesList";
	}
	
	// ajax call from filtering button
	public void showAllBikes(){
		bikesList = bikeDataProvider.getBikesByCategory(categoryId, false);
		
	}
	
	// ajax call from filtering button
	public void showDiscountBikes(){
		bikesList = bikeDataProvider.getBikesByCategory(categoryId, true);
		
	}

	// get / set
	
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public void setBikesList(List<Bike> bikesList) {
		this.bikesList = bikesList;
	}
	
	public List<Bike> getBikesList() {		
		return bikesList;
	}

	public void setBikeDataProvider(BikeDataProvider bikeDataProvider) {
		this.bikeDataProvider = bikeDataProvider;
	}
	
	
	
	


}
