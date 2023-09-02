package com.example.demo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.collection.Person;
import com.example.demo2.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public String save(Person person) {
        // TODO Auto-generated method stub
        return personRepository.save(person).getPersonId();
    }


    @Override
    public List<Person> getPersonStartWith(String name) {
        return personRepository.findByFirstNameStartsWith(name);
    }
    
}
