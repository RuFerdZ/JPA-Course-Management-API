package com.example.bootcamp.services;

import com.example.bootcamp.models.Topic;
import com.example.bootcamp.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        return topicRepository.findAll();
    }

    public Topic getTopic(String id){
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic){
        topicRepository.save(topic); // it checks whether there is already a pk in the same id
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
