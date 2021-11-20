package org.example.DAO;

import org.example.AppUser;
import org.example.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonDAOCollection implements PersonDAO{
    List<Person> personList = new ArrayList<Person>();

    @Override
    public Person persist(Person person) {
        personList.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
        for(Person p : personList){
            if(p.getId() == id) return p;
        }

        return null;
    }

    @Override
    public Optional<Person> findByEmail(String email) {
        return personList.stream()
                .filter(person -> person.getEmail().equalsIgnoreCase(email))
                .findFirst();
    }

    @Override
    public List<Person> findAll() {
        return personList;
    }

    @Override
    public void remove(int id) {
        Person person = findById(id);
        personList.remove(person);
    }
}
