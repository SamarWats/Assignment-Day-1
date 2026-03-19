package com.cg.entity;

import java.util.List;

public class SBU {

    private String sbuCode;
    private String sbuHead;
    private String sbuName;

    private List<Employee> empList;

    public SBU(String sbuCode, String sbuHead, String sbuName, List<Employee> empList) {
        this.sbuCode = sbuCode;
        this.sbuHead = sbuHead;
        this.sbuName = sbuName;
        this.empList = empList;
    }
    
    public String getSBUDetails() {

        return "SBU Code : " + sbuCode +
               "\nSBU Name : " + sbuName +
               "\nSBU Head : " + sbuHead;
    }

    public void displaySBUDetails() {

        System.out.println("SBU Code : " + sbuCode);
        System.out.println("SBU Name : " + sbuName);
        System.out.println("SBU Head : " + sbuHead);

        System.out.println("\nEmployee List:");

        for(Employee emp : empList) {
            System.out.println("Employee ID : " + emp.getEmpId());
            System.out.println("Employee Name : " + emp.getEmpName());
            System.out.println("Employee Salary : " + emp.getSalary());
            System.out.println();
        }
    }
}