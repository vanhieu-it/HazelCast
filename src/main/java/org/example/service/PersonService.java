package org.example.service;

import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.example.entity.Person;
import org.example.repo.PersonRepository;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    @Cacheable("persons")
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Cacheable("persons")
    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElse(null);
    }
}
