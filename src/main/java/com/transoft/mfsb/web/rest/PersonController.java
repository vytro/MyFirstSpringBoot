package com.transoft.mfsb.web.rest;

import com.transoft.mfsb.domain.Person;
import com.transoft.mfsb.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/people")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public ResponseEntity<List<Person>> getPeople(){
        return ResponseEntity.ok().body(personService.listPeople());
    }

    //incorrect way
    //theres yt tutorials etc, but not interacting with body, etc.
    //directly retuning a json list
//    @GetMapping("/one")
//    public List<Person> getPersona(){
//        return personService.listPeople();
//    }
}
