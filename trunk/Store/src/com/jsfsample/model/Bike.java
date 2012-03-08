package com.jsfsample.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bike")
public class Bike implements Serializable {
	
	private static final long serialVersionUID = 7362384441098790471L;
	private Integer id;
	private BikeCategory category;	
	private String name;
	private String description;
	private Integer price;	
	private Integer discountPrice;
	
	// bike_id has SERIAL data type in PostgreSQL (connected with auto generated sequence)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)     
	@Column(name="bike_id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name="bike_category_id")	
	public BikeCategory getCategory() {
		return category;
	}
	public void setCategory(BikeCategory category) {
		this.category = category;
	}
	
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name="price")
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	@Column(name="discount_price")
	public Integer getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(Integer discountPrice) {
		this.discountPrice = discountPrice;
	}
	
	
}
