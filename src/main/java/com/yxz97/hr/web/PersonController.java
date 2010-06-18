/************************************************************************
  			PersonController.java - Attribution-Noncommercial-Share Alike 3.0 Unported

You are free:
	free to Share  — to copy, distribute and transmit the work
	free to Remix — to adapt the work

Under the following conditions:
	Attribution — You must attribute the work in the manner specified by the author or licensor (but not in any way that suggests that they endorse you or your use of the work).
    Attribute this work:
    Information
    What does "Attribute this work" mean?
    	The page you came from contained embedded licensing metadata, including how the creator wishes to be attributed for re-use. You can use the HTML here to cite the work. Doing so will also include metadata on your page so that others can find the original work as well.
    	Noncommercial — You may not use this work for commercial purposes.
		Share Alike — If you alter, transform, or build upon this work, you may distribute the resulting work only under the same or similar license to this one.

 **************************************************************************/

package com.yxz97.hr.web;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yxz97.hr.domain.Person;
import com.yxz97.hr.service.PersonService;

@Controller
public class PersonController {

	private Log logger = LogFactory.getLog(getClass());
	@Resource
	private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
	public void list(Model model) {
    	List<Person> personList = personService.loadAll();
    	model.addAttribute(personList);
    	logger.info("returning to person/list.jsp personList:" + personList.toString());
	}

	public void setPersonManager(PersonService personService) {
		this.personService = personService;
	}
	
}
