package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(145, "Java Core Course", "this course contains basics of java"));
        list.add(new Course(4343, "Spring boot Course", "creating rest api using spring boot"));
    }
    @Override
    public List<Course> getCourses() {
        return null;
    }
}
