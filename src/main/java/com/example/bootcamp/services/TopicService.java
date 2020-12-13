package com.example.bootcamp.services;

import com.example.bootcamp.models.Topic;
import com.example.bootcamp.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("spring", "Spring Framework", "Spring Framework Description"),
//            new Topic("java", "Core Java", "Core Java Description"),
//            new Topic("javascript", "JavaScript", "JavaScript Description")
//    ));

    public List<Topic> getAllTopics(){
//        return topics;
        return topicRepository.findAll();
    }

    public Topic getTopic(String id){
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic){
//        topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic){
//        for (int index = 0; index<topics.size(); index++){
//            if (topics.get(index).getId().equals(id)){
//                topics.set(index, topic);
//                return;
//            }
//        }
        topicRepository.save(topic); // it checks whether there is already a pk in the same id
    }

    public void deleteTopic(String id) {
//        topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
