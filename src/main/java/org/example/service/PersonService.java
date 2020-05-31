package org.example.service;

import org.example.domain.Person;

public interface PersonService {

    Person getByName(String name);
}