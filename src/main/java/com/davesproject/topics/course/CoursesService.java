package com.davesproject.topics.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoursesService {

    @Autowired
    private CoursesRepository coursesRepository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        coursesRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id) {
        return coursesRepository.findById(id).orElse(null);

    }

    public void addCourse(Course course) {
        coursesRepository.save(course);
    }

    public void updateCourse(Course course) {
        // The repository is smart enough to check if the topic already exists
        coursesRepository.save(course);
    }

    public void deleteCourse(String id) {
        coursesRepository.deleteById(id);
    }
}
