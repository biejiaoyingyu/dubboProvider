package com.cxf.group;

import com.cxf.dubbo.entities.Book;
import com.cxf.dubbo.service.BookService;

import java.util.Arrays;
import java.util.List;

public class BookServiceImpl implements BookService {
    @Override
    public Book getOneBook(int i) {
        return new Book("红楼梦",2);
    }

    @Override
    public List<Book> qryAllBook() {
        return Arrays.asList(new Book("c++",1),new Book("python",2));
    }

    @Override
    public Book getOneBook4Callback(Integer id) {
        return null;
    }
}
