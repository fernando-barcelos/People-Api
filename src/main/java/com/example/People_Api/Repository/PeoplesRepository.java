package com.example.People_Api.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.People_Api.Entity.PeoplesEntity;

@Repository
public interface PeoplesRepository extends MongoRepository<PeoplesEntity, String> {
    Optional<PeoplesEntity> findById(String id);
    Optional<PeoplesEntity> findByName(String name);
    Optional<PeoplesEntity> findByEmail(String email);
    List<PeoplesEntity> findAll();
}
