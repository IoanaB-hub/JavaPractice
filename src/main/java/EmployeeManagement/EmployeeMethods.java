package EmployeeManagement;

import AccommodationsBooking.Category;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMethods {

    public static List<Double> raiseSalaryAndDisplayTheNewOnes(List<Employee> employeeList, double percentage) {

        List<Double> newSalaries = new ArrayList<>();

        for (Employee emp : employeeList) {
            double newSalary = emp.getSalary() + (emp.getSalary() * (percentage / 100));
            newSalaries.add(newSalary);
        }
        return newSalaries;

    }

    public static List<String> getEligibleEmployees(List<Employee> employeeList, int retirementAge) {
        List<String> eligiblePersons = new ArrayList<>();

        for (Employee emp : employeeList) {
            if (emp.getAge() >= retirementAge) {
                eligiblePersons.add(emp.getName());
            }
        }
        return eligiblePersons;

    }

    public static String compareSalary(Employee emp1, Employee emp2) {
        if (emp1.getSalary() > emp2.getSalary()) {
            return emp1.getName() + " earns more than " + emp2.getName() + ".";
        } else if (emp1.getSalary() < emp2.getSalary()) {
            return emp1.getName() + " earns less than " + emp2.getName() + ".";
        } else {
            return emp1.getName() + " and " + emp2.getName() + " have the same salary.";
        }
    }


    public static List<String> calculateTotalEarningsPerEmployee(List<Employee> employeeList) {

        List<String> earningsPerEmployee = new ArrayList<>();

        for (Employee emp : employeeList) {
            double totalEarnings = (emp.getSalary() * 12) * emp.getSeniority();
            String message = emp.getName() + " earned a total of: " + totalEarnings;
            earningsPerEmployee.add(message);
        }
        return earningsPerEmployee;

    }

    public static List<String> getEmployeesForEachJobTitle(List<Employee> employeeList, JobTitles jobTitles) {
        List<String> nameList = new ArrayList<>();

        for (Employee emp : employeeList) {
            if (emp.jobTitles.equals(jobTitles)) {
                nameList.add(emp.getName());
            }
        }
        return nameList;


    }


}
