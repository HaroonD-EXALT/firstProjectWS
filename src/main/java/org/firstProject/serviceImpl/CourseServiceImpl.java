package org.firstProject.serviceImpl;

import org.firstProject.database.AerospikeDatabase;
import org.firstProject.model.Course;
import org.firstProject.pojo.PojoCourse;
import org.firstProject.service.CourseService;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "org.firstProject.service.CourseService")
public class CourseServiceImpl implements CourseService {
    AerospikeDatabase database = AerospikeDatabase.getInstance();

    @Override
    public PojoCourse getAllCourses() {

        List<Course> courseList = database.getAllCourses();
        PojoCourse pojoCourse = new PojoCourse();
        pojoCourse.setCourses(courseList);
        return pojoCourse;
    }

    @Override
    public Course insertCourse(Course course) {
        return database.insertCourse(course);
    }

    @Override
    public Course getCourseById(long id) {
        return database.getCourseById(id);
    }

    @Override
    public Course deleteCourse(long id) {
        Course course = database.getCourseById(id);
        if (course.getNumOfStudent() == 0){
            database.removeCourse(id);
            return course;
        }
        return null;
    }
}
