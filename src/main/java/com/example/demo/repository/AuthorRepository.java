package com.example.demo.repository;

import com.example.demo.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface AuthorRepository extends MongoRepository<Author, String> {
    Optional<Author> findByName(String name);
}
