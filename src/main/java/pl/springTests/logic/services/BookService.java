package pl.springTests.logic.services;

import java.util.List;

import pl.springTests.logic.entities.Book;
import pl.springTests.logic.lists.BookList;

public interface BookService {

	Book deleteBook(Long bookId);
	Book updateBook(Long bookId, Book book);
	
	BookList findAllBooks();
	Book findBook(Long id);
	Book findBookByTitle(String title);
    
}
