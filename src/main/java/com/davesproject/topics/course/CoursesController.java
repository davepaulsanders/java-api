package com.davesproject.topics.course;

import com.davesproject.topics.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursesController {

    @Autowired
    private CoursesService coursesService;

    @GetMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id) {
        return coursesService.getAllCourses(id);
    }

    @GetMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id) {
        return coursesService.getCourse(id);
    }

    @PostMapping("/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        coursesService.addCourse(course);
    }

    @PutMapping("/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        coursesService.updateCourse(course);
    }

    @DeleteMapping("/topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id) {
        coursesService.deleteCourse(id);
    }

}
