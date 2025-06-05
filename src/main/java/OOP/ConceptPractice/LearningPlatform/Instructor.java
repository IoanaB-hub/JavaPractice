package OOP.ConceptPractice.LearningPlatform;

import java.util.List;

public class Instructor extends Person {

    private String department;
    private List<Course> courses;


    public Instructor(int userID, String name, String email, String department, List<Course> courses) {
        super(userID, name, email);
        this.department = department;
        this.courses = courses;

    }


    public List<Course> getCourses() {
        return courses;
    }

    @Override
    String getRole() {
        return "You are an instructor";
    }


    public void addCourse(Course course) {
        courses.add(course);
    }

    public void assignGrades(Student student, Course course, double grade) {

        if (courses.contains(course)) {
            student.receiveGrades(course, grade);
            System.out.println("Grade " + grade + " assigned to " + student.getName() + " for course " + course.getCourseName());

        } else {
            System.out.println("You don't teach this course, so you cannot assign grades.");
        }

    }


}
