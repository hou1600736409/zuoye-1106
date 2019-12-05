package com.aaa.model;



import java.io.Serializable;

public class Book implements Serializable {
    /**
     * 图书编号
     */
    private Integer bookId;

    /**
     * 图书名称
     */
    private String bookName;

    /**
     * 图书库存
     */
    private Integer bookStore;

    /**
     * 图书价格
     */
    private Double bookPrice;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookStore=" + bookStore +
                ", bookPrice=" + bookPrice +
                '}';
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookStore() {
        return bookStore;
    }

    public void setBookStore(Integer bookStore) {
        this.bookStore = bookStore;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }
}
