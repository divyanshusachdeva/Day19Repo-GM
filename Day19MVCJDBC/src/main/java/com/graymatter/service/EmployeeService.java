package com.graymatter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.dao.EmployeeDao;
import com.graymatter.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao empDao;
	
	public List<Employee> getAllEmployees() {
		return empDao.getAllEmployees();
	}
	
	public int addEmployee(Employee emp) {
		return empDao.addEmployee(emp);
	}
	
	public int deleteEmployee(Employee emp) {
		return empDao.deleteEmployee(emp);
	}
	
	public int updateEmployee(Employee emp) {
		return empDao.updateEmployee(emp);
	}
	
	public Employee getEmployeeById(int empId) {
		return empDao.getEmployeeById(empId);
	}
	
}
