package OOP.ConceptPractice.LearningPlatform;

import java.util.List;

public class Course {

    private int courseID;
    private String courseName;
    private int durationInWeeks;
    private Instructor instructor;
    private List<Student> enrolledStudents;


    public Course(int courseID, String courseName, int durationInWeeks, Instructor instructor, List<Student> enrolledStudents) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.durationInWeeks = durationInWeeks;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            System.out.println(student.getName() + " has been added to the course " + courseName);
        } else {
            System.out.println("Student is already enrolled in this course.");
        }
    }


    public void viewEnrolledStudents() {
        System.out.println("Students enrolled in " + getCourseName() + ":");

        for (Student s : enrolledStudents) {
            System.out.println(s.getName());
        }
    }

    @Override
    public String toString() {
        return courseName;
    }



}
