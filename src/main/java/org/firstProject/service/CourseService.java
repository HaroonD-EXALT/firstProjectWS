package org.firstProject.service;

import org.firstProject.model.Course;
import org.firstProject.pojo.PojoCourse;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CourseService {
    @WebMethod
    public PojoCourse getAllCourses();

    @WebMethod
    public Course insertCourse(Course course);

    @WebMethod
    public Course getCourseById(long id);

    @WebMethod
    public Course deleteCourse(long id);

}
