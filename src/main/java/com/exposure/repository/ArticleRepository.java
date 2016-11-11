package com.exposure.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.exposure.model.Article;

public interface ArticleRepository extends PagingAndSortingRepository<Article, Long> {

    //@Query("Select a.id,a.first_name,a.last_name from user a  left join pets b on a.id=b.owner")
    //public List<Article> findAllWithPets();
}