package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.News;

public interface NewsService {

	List<News> getHeadLine(String id);

	List<News> getNews(String id);

	News saveComment(News comment);

}
