/******************************************************************
  			PersonServiceImpl.java 
			- Attribution-Noncommercial-Share Alike 3.0 Unported

You are free, to Share  — to copy, distribute and transmit the work, 
to Remix — to adapt the work refer to 
http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_US more details

********************************************************************/

package com.yxz97.hr.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yxz97.hr.dao.PersonDao;
import com.yxz97.hr.domain.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Resource
	private PersonDao personDao;

	@Override
	public void delete(Person entity) {
		personDao.delete(entity);
	}

	@Override
	public void delete(Long entityId) {
		personDao.delete(entityId);
	}

	@Override
	public List<Person> loadAll() {
		return personDao.loadAll();		
	}

	@Override
	public Person loadById(Long entityId) {
		return personDao.loadById(entityId);
	}

	@Override
	public Person read(String entityName) {		
		return personDao.read(entityName);
	}

	@Override
	public Person save(Person entity) {
		return personDao.save(entity);
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public PersonDao getPersonDao() {
		return personDao;
	}

}
