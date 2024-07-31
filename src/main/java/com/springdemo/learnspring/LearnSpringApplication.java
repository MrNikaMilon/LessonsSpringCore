package com.springdemo.learnspring;

import com.springdemo.learnspring.entity.School;
import com.springdemo.learnspring.entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;


public class LearnSpringApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringConfig.class);
        List<Student> studentList = new ArrayList<>();
        Student studentNikon = context.getBean("student", Student.class);
        Student studentNail = context.getBean("student", Student.class);
        Student studentSergey = context.getBean("student", Student.class);
        Student studentOleg = context.getBean("student", Student.class);
        Student studentMax = context.getBean("student", Student.class);

        studentNikon.setGroup("IT"); studentNikon.setName("Nikon");
        studentList.add(studentNikon);

        studentNail.setGroup("IT"); studentNail.setName("Nail");
        studentList.add(studentNail);

        studentSergey.setGroup("IT"); studentSergey.setName("Sergey");
        studentList.add(studentSergey);

        studentOleg.setGroup("IT"); studentOleg.setName("Oleg");
        studentList.add(studentOleg);

        studentMax.setGroup("IT"); studentMax.setName("Max");
        studentList.add(studentMax);

        School newSchool = context.getBean("school", School.class);
        newSchool.setName("Cool School"); newSchool.setAddress("Moscow");
        System.out.println(newSchool+"\n");
        studentList.forEach(System.out::println);
    }
}
