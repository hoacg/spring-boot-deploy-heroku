package com.example.eshopdemo.controller;

import com.example.eshopdemo.model.Article;
import com.example.eshopdemo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("/news")
    public ResponseEntity<Void> createArticle(@RequestBody Article article) {
        articleService.save(article);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/news")
    public ResponseEntity<List<Article>> getAllArticles() {
        return new ResponseEntity<>(articleService.getList(), HttpStatus.OK);
    }
}
