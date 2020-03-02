package com.hcx.elastic.repository;

import com.hcx.elastic.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @ClassName BookRepository
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2020-03-02 10:38
 * @Version 1.0
 **/
public interface BookRepository extends ElasticsearchRepository<Book,Integer> {
}
