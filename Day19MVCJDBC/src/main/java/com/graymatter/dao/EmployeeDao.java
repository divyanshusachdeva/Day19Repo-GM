package com.graymatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.graymatter.model.Employee;

import lombok.Setter;

@Setter

@Component
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
//	
	// Insert query
	public int addEmployee(Employee emp) {
		
		String query = "INSERT INTO Employee VALUES (" + emp.getEmpId() + ",'" + emp.getEmpName() + "'," + emp.getEmpSal() + ");";
		return jdbcTemplate.update(query);
				
	}
	
	//Select query
	public List<Employee> getAllEmployees() {
		
		String query = "SELECT * FROM Employee;";
		List<Employee> empList = jdbcTemplate.query(query, new EmployeeRowMapper());
		return empList;
	}
	
	// Update query
	public int updateEmployee (Employee emp) {
		String query = "UPDATE Employee SET empSal=" + emp.getEmpSal() + "WHERE empId=" + emp.getEmpId();
		return jdbcTemplate.update(query);
	}
	
	
	// Delete query
	public int deleteEmployee (Employee emp) {
		String query = "DELETE FROM Employee WHERE empId =" + emp.getEmpId();
		return jdbcTemplate.update(query);

	}
	
	// Select by ID query
	public Employee getEmployeeById (int empId) {
		String query = "SELECT * FROM Employee WHERE empId =" + empId;
		List<Employee> empList = jdbcTemplate.query(query, new EmployeeRowMapper());
		return empList.get(0);
	}


}
