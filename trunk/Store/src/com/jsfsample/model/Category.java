
package com.jsfsample.model;


import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")

public class Category {

	private int categoryId;
	private String categoryName;
	private String categoryDesc;
	private String isVisible; 
	
//	private Category parent_category;
//	
//	public Category getParent_category() {
//		return parent_category;
//	}
//	public void setParent_category(Category parent_category) {
//		this.parent_category = parent_category;
//	}
	//private List<Category> sub_category;
	
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="category_id")
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	
	@Column(name="name")
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Column(name="descr")
	public String getCategoryDesc() {
		return categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	
	@Column(name="visible")
	public String isVisible() {
		return isVisible;
	}
	public void setVisible(String isVisible) {
		this.isVisible = isVisible;
	}
	
//	@OneToMany(cascade={CascadeType.REMOVE,CascadeType.PERSIST})
//	public List<Category> getSub_category() {
//		return sub_category;
//	}
//	public void setSub_category(List<Category> sub_category) {
//		this.sub_category = sub_category;
//	}
//	
	
}

