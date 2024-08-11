package com.graymatter;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.graymatter.dao.EmployeeDao;
import com.graymatter.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-bean.xml");
        
        EmployeeDao dao = (EmployeeDao) context.getBean("empdao");
        
//        //Inserting row
//        int i = dao.addEmployee(new Employee(125, "Priya", 51000));
//        System.out.println("Row inserted.");
//        
//        // Printing the records
        List<Employee> empList = dao.getAllEmployees();
//        for(Employee emp: empList)
//        	System.out.println(emp);
//        
//        // Updating a record
//        dao.updateEmployee(new Employee(123, "Divyanshu", 90000));
//        System.out.println("Record updated successfully");
//        
//        // Deleting a record
//        dao.deleteEmployee(new Employee(126, "Anuj", 67800));
//        System.out.println("Record deleted successfully");
//        
//        // Printing the records
//        for(Employee emp: empList)
//        	System.out.println(emp);
//        
        System.out.println("Employee by ID: " + dao.getEmployeeById(123));      
        
        
        
    }
}
