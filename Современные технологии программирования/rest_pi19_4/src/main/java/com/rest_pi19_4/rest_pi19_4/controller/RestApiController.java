package com.rest_pi19_4.rest_pi19_4.controller;

import com.rest_pi19_4.rest_pi19_4.entity.Person;
import com.rest_pi19_4.rest_pi19_4.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RestApiController {
    private final PersonService personService;

    @Autowired
    public RestApiController(PersonService personService){
        this.personService = personService;
    }

    @PostMapping(value = "/api/persons")
    public ResponseEntity<?> create(@RequestBody Person person){
        personService.create(person);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/api/persons")
    public  ResponseEntity<List<Person>> findAll(){
        final List<Person> personList = personService.findAll();

        if (personList != null) {
            return new ResponseEntity<>(personList, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/api/persons/{id}")
    public ResponseEntity<?> find(@PathVariable(name = "id") Long id){
        final Optional<Person> person = personService.findById(id);

        if (person.isPresent()) {
            return new ResponseEntity<>(person, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/api/persons/{id}")
    public ResponseEntity<?> updatePerson(@RequestBody Person person, @PathVariable(name = "id")Long id){
        if (personService.findById(id).isPresent()) {
            personService.updatePerson(person, id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping(value = "/api/persons/{id}")
    public ResponseEntity<?> deletePerson(@PathVariable(name = "id") Long id){
        if (personService.findById(id).isPresent()){
            personService.deletePerson(id);
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping(value = "/api/persons")
    public void deleteAll(){
        personService.deleteAll();
    }
}
