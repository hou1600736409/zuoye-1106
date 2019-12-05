package com.aaa.service.impl;

import com.aaa.mapper.BookMapper;
import com.aaa.model.Book;
import com.aaa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> getAllBook() {
        List<Book> bookList = bookMapper.getAllBook();
        return bookList;
    }

    @Override
    public void addBook(Book book) {
        bookMapper.addBook(book);
    }

    @Override
    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }

    @Override
    public void deleteBookById(Integer bookId) {
        bookMapper.deleteBookById(bookId);
    }
}
