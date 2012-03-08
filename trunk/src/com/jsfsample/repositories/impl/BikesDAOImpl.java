package com.jsfsample.repositories.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.jsfsample.model.Bike;
import com.jsfsample.repositories.BikesDAO;

@Repository("BikesRepository")
public class BikesDAOImpl implements BikesDAO {
	
	private EntityManager em = null;

    /**
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

	@SuppressWarnings("unchecked")
	@Override
	public List<Bike> loadBikesFromCategory(Integer categoryId, boolean onlyWithDiscount) {
		String sqlQuery = "select b from Bike b where b.category.categoryId = :catId";
		if (onlyWithDiscount) {
			sqlQuery = "select b from Bike b where b.category.categoryId = :catId and b.discountPrice != null";			
		}
		return em.createQuery(sqlQuery).setParameter("catId", categoryId).getResultList();		
	}

	@Override
	public Bike loadSelectedBike(Integer bikeId) {
		 return em.find(Bike.class, bikeId);
	}

	@Override
	public void saveBike(Bike newBike) {
		em.merge(newBike);		
	}

}
