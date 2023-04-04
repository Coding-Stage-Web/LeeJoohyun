package com.springmvc.repository;

import java.util.List;
import com.springmvc.domain.Book;
import java.util.Map;
import java.util.Set;

public interface BookRepository {
	List<Book> getAllBooks();
	List<Book> getBookListByCategory(String category);
	Set<Book> getBookListByFilter(Map<String, List<String>> filter);
}
