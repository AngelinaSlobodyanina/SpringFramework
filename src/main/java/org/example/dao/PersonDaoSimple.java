package org.example.dao;

import org.example.domain.Person;

public class PersonDaoSimple implements PersonDao {
    private int age;
    public Person findByName(String name) {
        return new Person(name, age);
    }
    public  void setDefaultAge(int age){
        this.age=age;
    }
    public int getDefaultAge() {
        return age;}
}