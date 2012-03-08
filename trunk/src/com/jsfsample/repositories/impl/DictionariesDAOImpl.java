package com.jsfsample.repositories.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.jsfsample.model.BikeCategory;
import com.jsfsample.repositories.DictionariesDAO;

@Repository("DictionaryRepository")
public class DictionariesDAOImpl implements DictionariesDAO {

	private EntityManager em = null;

    /**
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

	@Override
	public BikeCategory loadBikeCategroryById(Integer bikeCategory) {
		return em.find(BikeCategory.class, bikeCategory);
	}
	
	

}
