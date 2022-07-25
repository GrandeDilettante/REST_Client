package com.romanpakhomov.spring.rest;

import com.romanpakhomov.spring.rest.configuration.MyConfig;
import com.romanpakhomov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);


     //  List<Employee> allEmployees = communication.getAllEmployees();
     //   System.out.println(allEmployees);


     //   Employee empByID = communication.getEmployee(13);
     //   System.out.println(empByID);


     //   Employee emp = new Employee("Nikolay","Aleksandrov","HR", 135000);
     //   emp.setId(15);
     //   communication.saveEmployee(emp);

        communication.deleteEmployee(15);


    }
}
