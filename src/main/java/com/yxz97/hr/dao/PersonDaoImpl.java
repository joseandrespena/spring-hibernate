/******************************************************************
  			PersonDaoImpl.java
			- Attribution-Noncommercial-Share Alike 3.0 Unported

You are free, to Share  — to copy, distribute and transmit the work, 
to Remix — to adapt the work refer to 
http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_US more details

********************************************************************/

package com.yxz97.hr.dao;

import org.springframework.stereotype.Repository;

import com.yxz97.hr.dao.PersonDao;
import com.yxz97.hr.domain.Person;

@Repository(value="personDao")
public class PersonDaoImpl extends BaseDaoImpl<Person> implements PersonDao {

	private static final String LIST_PERSONBY_NAME = "listPersonByName";
	private static final String GET_BY_NAME = "getPersonByName";
	
	public PersonDaoImpl() {
		super(Person.class);
	}
	
	@Override
	protected String getByNamedQuery() {
		return GET_BY_NAME;
	}

	@Override
	protected String listByNamedQuery() {
		return LIST_PERSONBY_NAME;
	}

}
