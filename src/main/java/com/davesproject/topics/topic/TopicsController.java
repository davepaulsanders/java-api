package com.davesproject.topics.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicsController {
    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(topic, id);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}
