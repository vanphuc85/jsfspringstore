package com.jsfsample.repositories.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.jsfsample.model.Person;
import com.jsfsample.repositories.PersonDAO;

@Repository("PersonRepository")
public class PersonDAOImpl implements PersonDAO {
	
	private EntityManager em = null;
    
	/**
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

	@Override
	public Person getPersonByLogin(String login) {
		return (Person) em.createQuery("select p from Person p where p.login = :login").setParameter("login", login).getSingleResult();		
	}

}
