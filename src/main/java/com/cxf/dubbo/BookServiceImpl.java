package com.cxf.dubbo;

import com.alibaba.dubbo.rpc.RpcContext;
import com.cxf.dubbo.entities.Book;
import com.cxf.dubbo.service.BookService;

import java.util.Arrays;
import java.util.List;

public class BookServiceImpl implements BookService {
    @Override
    public Book getOneBook(int i) {
        String index = RpcContext.getContext().getAttachment("index");
        System.out.println("==================>"+index);
        return new Book("三国演义",1);
    }





    @Override
    public List<Book> qryAllBook()
    {
        return Arrays.asList(new Book("java",1),new Book("golang",2));
    }

    @Override
    public Book getOneBook4Callback(Integer id) {
        return new Book("callback",id);
    }
}
