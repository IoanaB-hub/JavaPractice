package OOP.ConceptPractice.LearningPlatform;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor(1, "John Gray", "johngray@gmail.com", "Computer Science Department", new ArrayList<>());
        Instructor instructor2 = new Instructor(2, "Salma Brown", "salmabrown@gmail.com", "Computer Science Department", new ArrayList<>());

        Student student1 = new Student(3, "Alice Martin", "alicemartin@gmail.com", 301, new HashMap<>());
        Student student2 = new Student(4, "Sebastian Carp", "sebastiancarp@gmail.com", 302, new HashMap<>());
        Student student3 = new Student(5, "Dayana Simba", "dayanasimba@gmail.com", 303, new HashMap<>());
        Student student4 = new Student(6, "Robert Smith", "robertsmith@gmail.com", 304, new HashMap<>());

        Course oop = new Course(10, "Object-Oriented Programming", 10, instructor1, new ArrayList<>());
        Course dataBaseManagement = new Course(11, "Database Management Systems", 8, instructor2, new ArrayList<>());
        Course programmingLanguage = new Course(12, "Programming language - Java", 20, instructor1, new ArrayList<>());


        System.out.println("Enrolling students...");
        student1.enrollInCourse(oop);
        student2.enrollInCourse(oop);
        student4.enrollInCourse(programmingLanguage);
        student3.enrollInCourse(dataBaseManagement);
        student4.enrollInCourse(dataBaseManagement);

        System.out.println();

        instructor1.addCourse(oop);
        instructor2.addCourse(dataBaseManagement);
        instructor1.addCourse(programmingLanguage);

        System.out.println();

        System.out.println("Assigning grades...");
        instructor1.assignGrades(student1, oop, 9.5);
        instructor1.assignGrades(student4, programmingLanguage, 9.7);
        instructor2.assignGrades(student3, dataBaseManagement, 8.8);

        System.out.println();

        System.out.println("Students viewing grades...");
        student1.viewGrade(oop);
        student2.viewGrade(oop);
        student3.viewGrade(dataBaseManagement);
        student4.viewGrade(dataBaseManagement);

        System.out.println();

        oop.viewEnrolledStudents();
        dataBaseManagement.viewEnrolledStudents();
        programmingLanguage.viewEnrolledStudents();

        System.out.println();

        System.out.println(student1.getEnrolledCourses());
        System.out.println(student2.getEnrolledCourses());
        System.out.println(student3.getEnrolledCourses());
        System.out.println(student4.getEnrolledCourses());

        System.out.println();

        student1.viewCoursesForEachInstructor(instructor1);
        student2.viewCoursesForEachInstructor(instructor2);



    }
}
