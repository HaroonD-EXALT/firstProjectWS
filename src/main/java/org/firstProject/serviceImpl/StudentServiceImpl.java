package org.firstProject.serviceImpl;

import org.firstProject.database.AerospikeDatabase;
import org.firstProject.model.Course;
import org.firstProject.model.Student;
import org.firstProject.pojo.PojoCourse;
import org.firstProject.pojo.PojoStudent;
import org.firstProject.service.StudentService;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "org.firstProject.service.StudentService")
public class StudentServiceImpl implements StudentService {
    private AerospikeDatabase database= AerospikeDatabase.getInstance();

    @Override
    public PojoStudent getAllStudents() {

        List<Student> students = database.getAllStudent();
        PojoStudent pojoStudent = new PojoStudent();
        pojoStudent.setStudents(students);
        return pojoStudent;
    }

    @Override
    public Student getStudentById(long id) {
        return database.getStudentById(id);
    }

    @Override
    public Student addStudent(Student student) {
        return database.insertStudent(student);
    }

    @Override
    public void removeStudent(long id) {
        database.deleteStudentById(id);
    }

    @Override
    public Student updateStudent(long id, Student student) {
        return database.updateStudent(id,student);
    }

    @Override
    public Student registerCourse(long stuId, long courseId) {
        return  database.registerCourse(stuId,courseId);
    }

    @Override
    public Student deleteRegCourse(long stuId, long courseId) {
        return  database.removeRegCourse(stuId,courseId);
    }
}
