package com.cg.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.entity.Employees;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface IEmployeeRepo extends JpaRepository<Employees, Integer>{
//	public List<Employees> findByEmpName(String empName);
	@Query("SELECT e FROM Employees e WHERE e.empName = :n")
	public List<Employees> getEmployeesByName(String n);
	public List<Employees> findBySalaryLessThan(double salary);
	public List<Employees> findByDobGreaterThan(LocalDate dob);
	public List<Employees> findByDobBetween(LocalDate dob1, LocalDate dob2);
	public List<Employees> findDistinctByEmpName(String n);
	
	
	

}
