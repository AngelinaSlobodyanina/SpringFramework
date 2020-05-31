package org.example.service;

import org.example.dao.PersonDao;
import org.example.domain.Person;

public class PersonServiceImpl implements PersonService {

    private PersonDao dao;

    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }

    public PersonServiceImpl() {}

    public void setDao(PersonDao dao){
        this.dao =dao;
    }

    public Person getByName(String name) {
        return dao.findByName(name);
    }
}