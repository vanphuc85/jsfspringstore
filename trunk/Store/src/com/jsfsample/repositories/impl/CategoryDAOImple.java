/*
Copyright (c) 2012 Canadian Imperial Bank of Commerce,
All Rights Reserved.
*
$Workfile:CategoryDAOImple.java $
*
$Archive: CategoryDAOImple.java $
$Author: ZhangKo $
$Date: Feb 1, 2012 9:43:42 AM $
$Revision: 1 $
*
$History: CategoryDAOImple.java $
*/

package com.jsfsample.repositories.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.jsfsample.model.Category;
import com.jsfsample.repositories.CategoryDAO;


@Repository("CategoryRepository")
public class CategoryDAOImple implements CategoryDAO {

	private EntityManager em = null;

    /**
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

	@Override
	public void save(Category c) {
		em.merge(c);		
	}

	@Override
	public void delelte(Category c) {
	   em.remove(c);
		
	}

	@Override
	public void update(Category c) {
	 
		getCategoryById(c.getCategoryId());
		
	}

	@Override
	public Category getCategoryById(int id) {
		
		return em.find(Category.class, id);
		
	}
	
	
	
	
}

