package org.firstProject.pojo;

import org.firstProject.model.Admin;
import org.firstProject.model.Course;

import java.util.ArrayList;
import java.util.List;

public class PojoCourse {
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    private List<Course> courses = new ArrayList<>();
}
