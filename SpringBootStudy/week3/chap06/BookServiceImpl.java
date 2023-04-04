package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springmvc.domain.Book;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.springmvc.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.getAllBooks();
	}
	
	public List<Book> getBookListByCategory(String category){
		List<Book> bookListByCategory = bookRepository.getBookListByCategory(category);
		return bookListByCategory;
	}
	
	public Set<Book> getBookListByFilter(Map<String, List<String>> filter){
		Set<Book> booksByFilter = bookRepository.getBookListByFilter(filter);
		return booksByFilter;
	}

}
