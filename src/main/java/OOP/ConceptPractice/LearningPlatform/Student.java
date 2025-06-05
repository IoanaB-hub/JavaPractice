package OOP.ConceptPractice.LearningPlatform;

import java.util.Map;

public class Student extends Person {

    int studentID;
    Map<Course, Double> enrolledCourses;


    public Student(int userID, String name, String email, int studentID, Map<Course, Double> enrolledCourses) {
        super(userID, name, email);
        this.studentID = studentID;
        this.enrolledCourses = enrolledCourses;
    }


    public Map<Course, Double> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void receiveGrades(Course course, double grade) {

        if (enrolledCourses.containsKey(course)) {
            enrolledCourses.put(course, grade);
            System.out.println("The grade is: " + grade + " for course " + course.getCourseName());
        } else {
            System.out.println("You are not enrolled in this course.");
        }

    }

    public void enrollInCourse(Course course) {
        if (!enrolledCourses.containsKey(course)) {
            enrolledCourses.put(course, null);
            course.addStudent(this); //this = the current student
            System.out.println("You have been enrolled in " + course.getCourseName());
        } else {
            System.out.println("You are already enrolled in this course.");
        }
    }

    public void viewGrade(Course course) {
        if (enrolledCourses.containsKey(course)) {
            Double grade = enrolledCourses.get(course);
            if (grade != null) {
                System.out.println("Your grade for course " + course.getCourseName() + " is: " + grade);

            } else {
                System.out.println("You don't have a grade yet for course " + course.getCourseName());

            }
        } else {
            System.out.println("You are not enrolled in this course.");

        }
    }


    @Override
    String getRole() {
        return "You are a student";
    }
}
