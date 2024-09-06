package org.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}