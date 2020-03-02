package com.hcx.elastic;

import com.hcx.elastic.bean.Article;
import com.hcx.elastic.bean.Book;
import com.hcx.elastic.repository.BookRepository;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoApplicationTests {

    @Autowired
    JestClient jestClient;

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

    /**
    * 利用jest  api 对es进行操作，Index，Search等操作搜索、插入
    * @param
    * @return void
    * @exception       
    **/
  @Test
  public void test(){
      //1 、 给es中索引（保存）一个文档
      Article article = new Article();
      article.setId(1);
      article.setAuthor("hcx");
      article.setContent("hgg");
      article.setTitle("it is a good message!");

      //构建一个索引功能
      Index index = new Index.Builder(article).index("hgg").type("message").build();
      try {
          //执行
          jestClient.execute(index);
      } catch (IOException e) {
          e.printStackTrace();
      }
  }

  //搜索功能
  @Test
  public void test2(){
      //查询表达式
      String json = "{\n" +
              "\"query\":{\n" +
              " \"match\":{\n" +
              "\"content\":\"good\"\n" +
              "}\n" +
              "}\n" +
              "}";
      Search search = new Search.Builder(json).addIndex("hgg").addType("message").build();

      try {
          SearchResult result = jestClient.execute(search);
          System.out.println(result.getJsonString());

      } catch (IOException e) {
          e.printStackTrace();
      }
  }

}
