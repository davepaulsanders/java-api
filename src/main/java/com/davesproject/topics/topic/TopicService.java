package com.davesproject.topics.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"), new Topic("java", "core java", "Discussing Java"), new Topic("javascript", "core javascript", "Another programming language")));

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return topicRepository.findById(id).orElse(null);

    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        // The repository is smart enough to check if the topic already exists
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}