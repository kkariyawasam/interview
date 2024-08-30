package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;



import javax.persistence.*;

@Entity
public class Category {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String name;
    
    @ManyToMany
    @JoinTable(
        name = "news_category",  // Join table name
        joinColumns = @JoinColumn(name = "category_id"),  
        inverseJoinColumns = @JoinColumn(name = "news_id")  
    )
    private Set<News> news = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public Set<News> getNews() {
		return news;
	}

	public void setNews(Set<News> news) {
		this.news = news;
	}
}

