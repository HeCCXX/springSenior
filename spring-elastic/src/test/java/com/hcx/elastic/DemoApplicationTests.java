package com.hcx.elastic;

import com.hcx.elastic.bean.Book;
import com.hcx.elastic.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoApplicationTests {

    @Autowired
    BookRepository bookRepository;

    @Test
    public void contextLoads() {
        Book book = new Book();
        book.setId(1);
        book.setAuthor("贺楚翔");
        book.setBookName("《修养》");

        bookRepository.index(book);
    }

}
