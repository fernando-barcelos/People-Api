package com.example.People_Api.Controll;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.People_Api.Entity.PeoplesEntity;
import com.example.People_Api.Repository.PeoplesRepository;

@RestController
@RequestMapping("/peoples")
public class PeoplesControll {
    @Autowired
    private PeoplesRepository peoplesRepository;

    @GetMapping("/all")
    public List<PeoplesEntity> getAllPeoples() {
        return peoplesRepository.findAll();
    }

    @PostMapping("/add")
    public PeoplesEntity addPeoples(@RequestBody PeoplesEntity peoples) {
        return peoplesRepository.save(peoples);
    }

    @GetMapping("/{id}")
    public PeoplesEntity getPeoplesById(@PathVariable String id) {
        return peoplesRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public PeoplesEntity updatePeople(@PathVariable String id, @RequestBody PeoplesEntity peopleEntity) {
        if (peoplesRepository.existsById(id)) {
            peopleEntity.setId(id);
            return peoplesRepository.save(peopleEntity);
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public String deletePeople(@PathVariable String id) {
        peoplesRepository.deleteById(id);
        return "Deleted";
        }
    }

