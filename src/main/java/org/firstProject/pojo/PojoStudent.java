package org.firstProject.pojo;

import org.firstProject.model.Admin;
import org.firstProject.model.Student;

import java.util.ArrayList;
import java.util.List;

public class PojoStudent {

    private List<Student>  students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
