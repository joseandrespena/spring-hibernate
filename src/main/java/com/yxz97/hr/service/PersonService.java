/******************************************************************
  			PersonService.java 
			- Attribution-Noncommercial-Share Alike 3.0 Unported

You are free, to Share  — to copy, distribute and transmit the work, 
to Remix — to adapt the work refer to 
http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_US more details

********************************************************************/

package com.yxz97.hr.service;

import java.util.List;

import com.yxz97.hr.domain.Person;

public interface PersonService  {
	public Person save(Person entity);
	public List<Person> loadAll();
	public Person loadById(Long entityId);
	public Person read(final String entityName);
	public void delete(Person entity);
	public void delete(Long entityId);
}
