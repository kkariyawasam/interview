package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class News {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 Integer id;
	 
	 String headLine;
	 
	 String news;
	 
	 String comment;
	 
	 @ManyToMany(mappedBy = "news")
	 private Set<Category> Categories = new HashSet<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHeadLine() {
		return headLine;
	}

	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Set<Category> getCategories() {
		return Categories;
	}

	public void setCategories(Set<Category> categories) {
		Categories = categories;
	}


}
