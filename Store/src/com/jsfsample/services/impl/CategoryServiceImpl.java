/*
Copyright (c) 2012 Canadian Imperial Bank of Commerce,
All Rights Reserved.
*
$Workfile:CategoryServiceImpl.java $
*
$Archive: CategoryServiceImpl.java $
$Author: ZhangKo $
$Date: Feb 15, 2012 9:43:20 AM $
$Revision: 1 $
*
$History: CategoryServiceImpl.java $
*/

package com.jsfsample.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jsfsample.model.Category;
import com.jsfsample.repositories.CategoryDAO;
import com.jsfsample.services.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{

	
	@Resource(name="CategoryRepository")
	private CategoryDAO categoryRepository;
	
	@Transactional
	@Override
	public void add(Category c) {
//		BikeCategory categorySelected = dictionaryRepository.loadBikeCategroryById(categoryId);
//		newBike.setCategory(categorySelected);
		
		categoryRepository.save(c);
		
		
	}
	
}

