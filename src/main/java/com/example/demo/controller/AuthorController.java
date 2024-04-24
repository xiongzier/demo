package com.example.demo.controller;

import com.example.demo.model.Author;
import com.example.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping
    public Author addAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable String id) {
        return authorService.getAuthorById(id).orElse(null);
    }

    @GetMapping("/search")
    public Author getAuthorByName(@RequestParam String name) {
        return authorService.getAuthorByName(name).orElse(null);
    }

    @PutMapping("/{id}")
    public Author updateAuthorName(@PathVariable String id, @RequestBody String name) {
        return authorService.updateAuthorName(id, name);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable String id) {
        authorService.deleteAuthor(id);
    }
}
