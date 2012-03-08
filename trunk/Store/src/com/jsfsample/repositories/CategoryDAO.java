package com.jsfsample.repositories;


import com.jsfsample.model.Category;

public interface CategoryDAO {

	public void save(Category c);
	
	
	public void delelte(Category c);
	
	
	public void update(Category c);
	
	
	public Category getCategoryById(int id);
	
}

