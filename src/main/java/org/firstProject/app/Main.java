package org.firstProject.app;
import org.firstProject.serviceImpl.AdminServiceImpl;
import org.firstProject.serviceImpl.CourseServiceImpl;
import org.firstProject.serviceImpl.StudentServiceImpl;

import javax.xml.ws.Endpoint;


public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/ws/api/admins", new AdminServiceImpl());
        Endpoint.publish("http://localhost:8888/ws/api/students", new StudentServiceImpl());
        Endpoint.publish("http://localhost:8888/ws/api/courses", new CourseServiceImpl());

    }
}