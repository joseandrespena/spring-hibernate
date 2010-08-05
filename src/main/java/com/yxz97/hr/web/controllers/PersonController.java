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

package com.yxz97.hr.web.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

//import com.digitalarbor.hr.exceptions.UserExistsException;
import com.yxz97.hr.domain.Person;
import com.yxz97.hr.service.PersonService;

@Controller
public class PersonController {

	private Log logger = LogFactory.getLog(getClass());
	@Resource
	private PersonService personService;
	
	public void setPersonManager(PersonService personService) {
		this.personService = personService;
	}

    @RequestMapping(method = RequestMethod.GET)
	public void list(Model model) {
    	List<Person> personList = personService.loadAll();
    	model.addAttribute(personList);
    	logger.info("returning to person/list.jsp personList:" + personList.toString());
	}
    
    @RequestMapping(method = RequestMethod.GET)
    public void form(ModelMap model) {
    	Person person = new Person();
		model.addAttribute("person", person);
		logger.info("returning person/form");
    }
    
    /*@RequestMapping(value="/person/{id}", method=RequestMethod.GET)
    public String getView(@PathVariable("id") Long id, Model model) {
    	Person person = personService.loadById(id);
    	if (person != null)
    	model.addAttribute(person);
    	return "person/form.do";    	
    }*/
    
    @RequestMapping(method = RequestMethod.POST)
	public ModelAndView form(@ModelAttribute Person person, BindingResult result, SessionStatus status) {
		ModelAndView mv = new ModelAndView("redirect:/person/list.do");
		logger.info("validating person:" + person.toString());
		if (result.hasErrors()) {
			mv = new ModelAndView("person/list.do");
		} else {
			try {
				this.personService.save(person);
				logger.info("inserted new person sucessful");
			} catch (Exception ex) {
				logger.info("problem save person:" + ex.toString());
			}
		}
		return mv;
	}
    
}
