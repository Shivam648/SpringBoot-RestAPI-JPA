package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourse(long courseId);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(long parseLong);
}
