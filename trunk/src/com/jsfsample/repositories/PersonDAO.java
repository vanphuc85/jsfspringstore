package com.jsfsample.repositories;

import com.jsfsample.model.Person;

public interface PersonDAO {

	public Person getPersonByLogin(String login);
}
