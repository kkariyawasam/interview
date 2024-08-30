package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.News;
import com.example.demo.service.NewsService;

@RestController
@RequestMapping
public class NewsController {
	
    @Autowired
    private NewsService newsService;

    @GetMapping("/{id}") //passing category id
    public List<News> getHeadLine(@PathVariable String id) {
        return newsService.getHeadLine(id);
    }
    
    @GetMapping("/{id}") //passing news id
    public List<News> getNews(@PathVariable String id) {
        return newsService.getNews(id);
    }
    
    @PutMapping("/save")
    public News saveComment(@RequestBody News news) {
        return newsService.saveComment(news);
    }
    
    

}
