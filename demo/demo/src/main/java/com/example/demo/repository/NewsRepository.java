package com.example.demo.repository;

import com.example.demo.entity.Category;
import com.example.demo.entity.News;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {


	@Query("SELECT id,headLine FROM News n JOIN n.categories c WHERE c.id = :categoryId")
	List<News> getHeadLines(@Param("categoryid") String id);

	@Query("SELECT id,news FROM News n WHERE n.id = :newsid")
	List<News> getNews(@Param("newsid")String id);
}

