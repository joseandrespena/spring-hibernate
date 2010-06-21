/******************************************************************
  			PersonServiceTest.java 
			- Attribution-Noncommercial-Share Alike 3.0 Unported

You are free, to Share  — to copy, distribute and transmit the work, 
to Remix — to adapt the work refer to 
http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_US more details

 ********************************************************************/

package com.yxz97.hr.service;

import javax.annotation.Resource;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;;

public class PersonServiceIntegrationTest extends BaseServiceIntegrationTest {

	@Resource
	private PersonService personService;

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	public PersonService getPersonService() {
		return personService;
	}
	
	@Test
	public void testFindAll() {
		java.util.List<com.yxz97.hr.domain.Person> allPerson = personService.loadAll();
		assertNotNull(allPerson);
	}
}
