package com.example.bootcamp.repository;

import com.example.bootcamp.models.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TopicRepository extends CrudRepository<Topic, String> {  // <class, id datatype>


    @Override
    <S extends Topic> S save(S s);

    List<Topic> findAll();
}
