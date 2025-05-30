package EmployeeManagement;

public class Employee {

    String name;
    JobTitles jobTitles;
    int age;
    int seniority;
    double salary;

    public Employee(String name, JobTitles jobTitles, int age, int seniority, double salary) {
        this.name = name;
        this.jobTitles = jobTitles;
        this.age = age;
        this.seniority = seniority;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public JobTitles getJobTitles() {
        return jobTitles;
    }

    public int getAge() {
        return age;
    }

    public int getSeniority() {
        return seniority;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitles=" + jobTitles +
                ", age=" + age +
                ", seniority=" + seniority +
                ", salary=" + salary +
                '}';
    }
}
