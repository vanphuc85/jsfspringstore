/**
 * 
 */
package com.jsfsample.managedbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import com.jsfsample.model.Bike;
import com.jsfsample.services.BikeDataProvider;

@ManagedBean(name="addBike")
@SessionScoped
public class AddBike implements Serializable {

	private static final long serialVersionUID = -2155913853431899821L;
	
	
	@ManagedProperty("#{bikeDataProvider}")
	private BikeDataProvider bikeDataProvider; // injected Spring defined service for bikes
	
	private String name;
	private String description;
	private String price;
	private String discountPrice;
	private Integer categoryId;
	
	public String addNewBike(){

		Bike newBike = new Bike();
		newBike.setName(getName());
		newBike.setDescription(getDescription());
		newBike.setPrice(Integer.parseInt(getPrice()));
		newBike.setDiscountPrice(Integer.parseInt(getDiscountPrice()));		
		
		// save new bike and return to the shop
		bikeDataProvider.add(newBike, categoryId);		
		return "/bikesShop.xhtml";
	};
	
	public String showForm(){		
		name = null;
		description = null;
		price = null;
		discountPrice = null;		
		
		return "/admin/addBike.xhtml?faces-redirect=true"; // perform redirect to obtain real URL in browser
	}
	
	// get/set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(String discountPrice) {
		this.discountPrice = discountPrice;
	}
	
	
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public void setBikeDataProvider(BikeDataProvider bikeDataProvider) {
		this.bikeDataProvider = bikeDataProvider;
	}


}
