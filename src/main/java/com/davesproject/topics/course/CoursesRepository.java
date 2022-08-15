package com.davesproject.topics.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursesRepository extends CrudRepository<Course, String> {

    // Find all courses for a particular topic
    public List<Course> findByTopicId(String topicId);
}
