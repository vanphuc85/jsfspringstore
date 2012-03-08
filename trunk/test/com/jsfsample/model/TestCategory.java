
package com.jsfsample.model;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.jsfsample.repositories.CategoryDAO;
import com.jsfsample.services.BikeDataProvider;
import com.jsfsample.services.CategoryService;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:test/applicationContext.xml"})
@TransactionConfiguration
@Transactional
public class TestCategory extends AbstractTransactionalJUnit4SpringContextTests{


//	@Autowired
//	private BikeDataProvider bikeDataProvider;
//    //private CategoryDataProvider CategoryDataProviderImpl;    
//	
//	
//	public BikeDataProvider getBikeDataProvider() {
//		return bikeDataProvider;
//	}
//
//
//	public void setBikeDataProvider(BikeDataProvider bikeDataProvider) {
//		this.bikeDataProvider = bikeDataProvider;
//	}
//
//
//	@Test
//	public void testSave() {
//	 
//		Bike newBike = new Bike();
//		newBike.setName("aa");
//		newBike.setDescription("big aa");
//		newBike.setPrice(Integer.parseInt("2222"));
//		newBike.setDiscountPrice(Integer.parseInt("222"));		
//		
//		// save new bike and return to the shop
//		bikeDataProvider.add(newBike, 2);	
//	}

	@Autowired
	private CategoryService categoryService;

	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}    

	
	@Autowired
	private CategoryDAO CategoryDAOImple;
	
	
	public CategoryDAO getCategoryDAOImple() {
		return CategoryDAOImple;
	}

	public void setCategoryDAOImple(CategoryDAO categoryDAOImple) {
		CategoryDAOImple = categoryDAOImple;
	}

	@Test
	public void testSaveCategory()
	{
		Category c = new Category();
		c.setCategoryDesc("AAAA");
		c.setCategoryName("aaa");
		c.setVisible("gg");
		
		Category c1 = new Category();
		c1.setCategoryDesc("AAAA1");
		c1.setCategoryName("aaa1");
		//c1.setVisible(true);
		
		Category c2 = new Category();
		c2.setCategoryDesc("AAAA2");
		c2.setCategoryName("aaa2");
		//c2.setVisible(true);		
		
		List<Category> l = new ArrayList<Category>();
		l.add(c1);
		l.add(c2);
		
		//c.setSub_category(l);
		
		//categoryService.add(c1);
		categoryService.add(c);
	}
	
}

