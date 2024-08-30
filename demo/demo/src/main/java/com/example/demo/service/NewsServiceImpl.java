package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.News;
import com.example.demo.repository.NewsRepository;
import java.util.NoSuchElementException;

@Service
public class NewsServiceImpl implements NewsService {
	
	    @Autowired
	    private NewsRepository newsRepository;


		@Override
		public List<News> getHeadLine(String id) {
			
			return newsRepository.getHeadLines(id);
		}

		@Override
		public List<News> getNews(String id) {
			return newsRepository.getNews(id);
			
		}

		@Override
		public News saveComment(News news) {		
		Optional<News> savedNews = newsRepository.findById(news.getId());
		
		if (savedNews.isPresent()) {
			News existingNews = savedNews.get();
			existingNews.setComment(news.getComment());

			return newsRepository.save(existingNews);
		} else {
			throw new NoSuchElementException("News with given ID does not exist");
		}
		
		}

}
