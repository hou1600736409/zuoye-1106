package com.aaa.service;

import com.aaa.model.Book;

import java.util.List;

public interface BookService {
    /**
    * 获取所有书籍信息
    * @param
    * @return java.util.List<com.aaa.model.Book>
    * @Author: cat
    * @Date: 2019/11/6
    */
    List<Book> getAllBook();
    /**
    * 增加书籍
    * @param book
    * @return void
    * @Author: cat
    * @Date: 2019/11/6
    */
    void addBook(Book book);
    /**
    * 修改书籍信息
    * @param book
    * @return void
    * @Author: cat
    * @Date: 2019/11/6
    */
    void updateBook(Book book);
    /**
    * 根据书籍编号删除对应书籍
    * @param bookId
    * @return void
    * @Author: cat
    * @Date: 2019/11/6
    */
    void deleteBookById(Integer bookId);
}
