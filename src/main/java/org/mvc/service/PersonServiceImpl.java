package org.mvc.service;

import java.util.List;

import org.mvc.model.Person;
import org.mvc.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("servicePerson")
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	@Transactional
	public Person addPerson(Person person) {
        personRepository.addPerson(person);
		return null;
	}

	@Override
	public List<Person> listPerson() {
        
		return personRepository.listPerson();
	}

	@Override
	public Person getPerson(int id) {
        personRepository.getPerson(id);
		return null;
	}

	@Override
	@Transactional
	public void deletePerson(int id) {
        personRepository.deletePerson(id);
		
	}

}
