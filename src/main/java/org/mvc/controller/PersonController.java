package org.mvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.mvc.service.PersonService;
import org.mvc.model.Person;


@Controller
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping("/person")
	public String formPerson(ModelMap model){
		
		model.addAttribute("myListPerosn", personService.listPerson());
		System.out.println(personService.listPerson().size());
		return "person";
	}
	
	@RequestMapping("/formPerson")
	public String addPerson(ModelMap model ){  
		
		Person person = new Person();
		model.addAttribute("person", person);

		return "formPerson";
	}
	
	@RequestMapping(value = "savePerson", method = RequestMethod.POST)
	public String addArticle(@ModelAttribute("person") Person person, BindingResult result) {
		
		
		if(result.hasErrors()) {
			return "addArticle";
		}else{
			personService.addPerson(person);		
		}		
		return "redirect:person.html";
	}
	
}
