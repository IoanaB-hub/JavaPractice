package EmployeeManagement;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee("Emily", JobTitles.SOFTWARE_TESTER, 33, 1, 5000.00),
                new Employee("John", JobTitles.FRONTEND_DEVELOPER, 27, 4, 6000.00),
                new Employee("Daniel", JobTitles.BUSINESS_ANALYST, 63, 20, 7000.00),
                new Employee("Sonia", JobTitles.BUSINESS_ANALYST, 62, 30, 8000.00),
                new Employee("Mary", JobTitles.BACKEND_DEVELOPER, 30, 2, 8000.00));


        System.out.println("The new salaries are: " + EmployeeMethods.raiseSalaryAndDisplayTheNewOnes(employeeList, 15.00));
        System.out.println("Eligible employees for retirement : " + EmployeeMethods.getEligibleEmployees(employeeList, 62));
        System.out.println("The result for compare salary is: " + EmployeeMethods.compareSalary(employeeList.get(0), employeeList.get(1)));
        System.out.println("The result for compare salary is: " + EmployeeMethods.compareSalary(employeeList.get(2), employeeList.get(1)));
        System.out.println("The result for compare salary is: " + EmployeeMethods.compareSalary(employeeList.get(3), employeeList.get(4)));

        List<String> earnings = EmployeeMethods.calculateTotalEarningsPerEmployee(employeeList);
        for (String message : earnings) {
            System.out.println(message);
        }

        JobTitles jobTitle = JobTitles.BUSINESS_ANALYST;
        System.out.println("The names of the employees with job title " + jobTitle + ": " + EmployeeMethods.getEmployeesForEachJobTitle(employeeList, jobTitle));


    }


}
