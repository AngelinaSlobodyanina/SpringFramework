package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.example.domain.Person;
import org.example.service.PersonService;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        PersonService service = context.getBean(PersonService.class);


        BufferedReader reader = new BufferedReader(new FileReader(
                "src/main/resources/mydata.csv"));

        String line = null;
        Scanner scanner = null;
        int index = 0;

        Scanner in = new Scanner(System.in);
        String name, answer = null;
        System.out.println("Enter your name  ");
        name = in.nextLine();
        Person newName = service.getByName(name);
        Student emp = new Student();

        while ((line = reader.readLine()) != null) {

            scanner = new Scanner(line);
            scanner.useDelimiter(";");
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0) {
                    emp.setName(data);
                    if (name.equals(emp.getName())) {

                        System.out.println("Are your age " + newName.getAge() + " ?");
                        answer = in.nextLine();
                        data = scanner.next();

                        emp.setSurname(data);
                        data = scanner.next();

                        emp.setAge(data);
                        data = scanner.next();
                        emp.setRole(data);
                    }
                }
                index++;

            }
            index = 0;

        }
        reader.close();

        System.out.println("\nYour firstname is " + newName.getName() + "\nYour lasrname is " + emp.getSurname() +
                "\nWe asked you about your age and you answered " + answer + "\nBecause your age is " +
                emp.getAge() + "\nYour role is " + emp.getRole());


    }
}

