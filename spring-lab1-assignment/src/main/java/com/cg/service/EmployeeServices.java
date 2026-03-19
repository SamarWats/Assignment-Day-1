package com.cg.service;

import org.springframework.stereotype.Service;

import com.cg.entity.Employee;
import com.cg.entity.SBU;

@Service
public class EmployeeServices {

    public Employee getEmployeeDetails() {

        SBU sbu = new SBU("PES-BU","Product Engineering Services","XYZ");

        Employee emp = new Employee(100,"Rama", 12345.67, 30,sbu);

        return emp;
    }
}
//package com.cg.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.cg.entity.Employee;
//import com.cg.entity.SBU;
//
////@Service
////public class EmployeeServices {
////
////    public SBU getSBUDetails() {
////
////        List<Employee> empList = new ArrayList<>();
////
////        empList.add(new Employee(100, "Rama", 12345.67, "PES-BU", 30));
////        empList.add(new Employee(101, "Krishna", 20000, "PES-BU", 28));
////
////        SBU sbu = new SBU("PES-BU","XYZ","Product Engineering Services",empList);
////
////        return sbu;
////    }
//    
//    @Service
//    public Employee getEmployeeDetails() {
//
//        SBU sbu = new SBU("PES-BU","Product Engineering Services","XYZ");
//
//        Employee emp = new Employee(100,"Rama",12345.67,sbu);
//
//        return emp;
//    	}
//  }