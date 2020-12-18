package com.example.eshopdemo.service;

import com.example.eshopdemo.model.Article;
import com.example.eshopdemo.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService implements IArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public void save(Article article) {
        articleRepository.save(article);
    }

    @Override
    public List<Article> getList() {
        return (List<Article>) articleRepository.findAll();
    }
}
