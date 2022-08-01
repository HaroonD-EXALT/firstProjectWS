package org.firstProject.service;


import org.firstProject.model.Student;
import org.firstProject.pojo.PojoStudent;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface StudentService {

    @WebMethod
    public PojoStudent getAllStudents();

    @WebMethod
    public Student getStudentById(long id);

    @WebMethod
    public Student addStudent(Student student);

    @WebMethod
    public void removeStudent(long id);

    @WebMethod
    public Student updateStudent(long id, Student student);

    @WebMethod
    public Student registerCourse(long stuId, long courseId);

    @WebMethod
    public Student deleteRegCourse(long stuId, long courseId);

}
