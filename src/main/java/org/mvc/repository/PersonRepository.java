package org.mvc.repository;

import java.util.List;

import org.mvc.model.Person;

public interface PersonRepository {

	public Person addPerson(Person person);
	public List<Person> listPerson();
	public Person getPerson(int id);
	public void deletePerson(int id);

}
