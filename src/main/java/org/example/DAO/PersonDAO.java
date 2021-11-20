package org.example.DAO;

import org.example.AppUser;
import org.example.Person;

import java.util.List;
import java.util.Optional;

public interface PersonDAO {
    Person persist(Person person);
    Person findById(int id);
    Optional<Person> findByEmail(String email);
    List<Person> findAll();
    void remove(int id);
}