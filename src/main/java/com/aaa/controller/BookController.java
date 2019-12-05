package com.aaa.controller;

import com.aaa.model.Book;
import com.aaa.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/getAllBook")
    public @ResponseBody List<Book> getAllBook(HttpServletResponse httpServletResponse) throws IOException {
        List<Book> bookList = bookService.getAllBook();
        return  bookList;
    }

    @RequestMapping("/updateBook")
    @ResponseBody
    public void updateBook(Book book){
        Integer bookId = book.getBookId();
        System.out.println(bookId);
        if (bookId == null){
            bookService.addBook(book);
        }else {
            bookService.updateBook(book);
        }
    }
    @RequestMapping("/deleteBookById")
    @ResponseBody
    public void deleteBookById(Integer bookId){

        bookService.deleteBookById(bookId);

    }
}
