package org.example.dao;

import org.example.domain.Person;

public interface PersonDao {

    Person findByName(String name);
}