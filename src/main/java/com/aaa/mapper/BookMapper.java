package com.aaa.mapper;

import com.aaa.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
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
    * 根据书的编号删除书籍
    * @param bookId
    * @return void
    * @Author: cat
    * @Date: 2019/11/6
    */
    void deleteBookById(Integer bookId);
}
