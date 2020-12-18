package com.example.eshopdemo.repository;

import com.example.eshopdemo.model.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
