package com.example.demo2.service;

import java.util.List;

import com.example.demo2.collection.Person;

public interface PersonService {

    String save(Person person);

    List<Person> getPersonStartWith(String name);
    
    
}
