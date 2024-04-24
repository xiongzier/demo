package com.example.demo.service;

import com.example.demo.model.Author;
import com.example.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Optional<Author> getAuthorById(String id) {
        return authorRepository.findById(id);
    }

    public Optional<Author> getAuthorByName(String name) {
        return authorRepository.findByName(name);
    }

    public Author updateAuthorName(String id, String newName) {
        Optional<Author> author = authorRepository.findById(id);
        if (author.isPresent()) {
            Author updatedAuthor = author.get();
            updatedAuthor.setName(newName);
            authorRepository.save(updatedAuthor);
            return updatedAuthor;
        }
        return null;
    }

    public void deleteAuthor(String id) {
        authorRepository.deleteById(id);
    }
}
