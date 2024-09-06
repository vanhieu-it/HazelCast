package org.example;

import org.example.entity.Person;
import org.example.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;

@EnableCaching
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication
                .run(Main.class);
        PersonService personService = applicationContext
                .getBean(PersonService.class);
//        Person person = new Person();
//        person.setName("Hieu");
//        person = personService.savePerson(person);
//        System.out.println("save person: " + person);

        Person fetchedPerson1 = personService.getPersonById(
                6L
        );
        System.out.println("fetched person1: " + fetchedPerson1);
        Person fetchedPerson2 = personService.getPersonById(
                4L
        );
        System.out.println("fetched person2: " + fetchedPerson2);
    }

}