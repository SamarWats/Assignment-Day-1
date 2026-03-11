package com.labs;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {

    private static List<Employee> employees = EmployeeRepo.getEmployees();
    private static List<Department> departments = EmployeeRepo.getDepartments();

    // Sum of salary of all employees
    public static double getTotalSalary() {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }

    // Department names and count of employees
    public static Map<String, Long> getEmployeeCountByDepartment() {
        return employees.stream()
                .filter(e -> e.getDepartment() != null)
                .collect(Collectors.groupingBy(
                        e -> e.getDepartment().getDepartmentName(),
                        Collectors.counting()
                ));
    }

    
    public static Optional<Employee> getSeniorMostEmployee() {
        return employees.stream().min(Comparator.comparing(Employee::getHireDate));
    }


    public static void getEmployeeServiceDuration() {
        employees.forEach(e -> {Period period = Period.between(e.getHireDate(), LocalDate.now());
            System.out.println(e.getFirstName() + " " + e.getLastName() +" -> " + period.getYears() + " Years, " + period.getMonths() + " Months, " + period.getDays() + " Days"
            );
        });
    }


    public static List<Employee> getEmployeesWithoutDepartment() {
        return employees.stream()
                .filter(e -> e.getDepartment() == null)
                .collect(Collectors.toList());
    }


    public static List<Department> getDepartmentsWithoutEmployees() {
        return departments.stream()
                .filter(d -> employees.stream()
                        .noneMatch(e ->
                                e.getDepartment() != null &&
                                e.getDepartment().getDepartmentId() == d.getDepartmentId()
                        ))
                .collect(Collectors.toList());
    }


    
    public static Optional<Map.Entry<String, Long>> getDepartmentWithHighestEmployees() {
        return getEmployeeCountByDepartment()
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
    }
}

