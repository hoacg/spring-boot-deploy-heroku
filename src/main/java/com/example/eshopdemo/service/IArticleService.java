package com.example.eshopdemo.service;

import com.example.eshopdemo.model.Article;

import java.util.List;

public interface IArticleService {
    void save(Article article);
    List<Article> getList();
}
