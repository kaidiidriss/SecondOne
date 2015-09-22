package org.mvc.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.mvc.model.Person;
import org.springframework.stereotype.Repository;

@Repository("personRepository")
public class PersonRepositoryImlp implements PersonRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override 
	public Person addPerson(Person person) {
        em.persist(person);
		return null;
	}

	@Override
	public List<Person> listPerson() {
		Query query = em.createQuery("FROM Person");
		List<Person> listPerson = query.getResultList();
		return listPerson;

	}

	@Override
	public Person getPerson(int id) {
		
		Query query = em.createQuery("SELECT p FROM Person p WHERE p.id="+id);
		Person person = (Person) query.getSingleResult();
          return person;
	}

	@Override
	public void deletePerson(int id) {
		// TODO Auto-generated method stub
		
	}

}
