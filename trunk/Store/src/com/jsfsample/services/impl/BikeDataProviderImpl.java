package com.jsfsample.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jsfsample.model.Bike;
import com.jsfsample.model.BikeCategory;
import com.jsfsample.repositories.BikesDAO;
import com.jsfsample.repositories.DictionariesDAO;
import com.jsfsample.services.BikeDataProvider;

/* 
 * Spring defined service for performing all operations on bikes:
 * - loading all bikes from given category
 * - loading selected bike details
 * - adding new bike 
 */

@Service("bikeDataProvider")
public class BikeDataProviderImpl implements BikeDataProvider {


	@Resource(name="DictionaryRepository")
	private DictionariesDAO dictionaryRepository;
	
	@Resource(name="BikesRepository")
	private BikesDAO bikesRepository;
	
	/* (non-Javadoc)
	 * @see com.jsfsample.services.impl.BikeDataProvider#getBikesByCategory(java.lang.Integer, boolean)
	 */
	public List<Bike> getBikesByCategory(Integer categoryId, boolean onlyWithDiscount) {
		return bikesRepository.loadBikesFromCategory(categoryId, onlyWithDiscount);
	}
	
	/* (non-Javadoc)
	 * @see com.jsfsample.services.impl.BikeDataProvider#getBikeById(java.lang.Integer)
	 */
	public Bike getBikeById(Integer id){
		return bikesRepository.loadSelectedBike(id);
	}

	@Transactional
	@Override
	public void add(Bike newBike, Integer categoryId) {
		BikeCategory categorySelected = dictionaryRepository.loadBikeCategroryById(categoryId);
		newBike.setCategory(categorySelected);
		bikesRepository.saveBike(newBike);
	}
	
}
