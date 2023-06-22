package com.jtf.template.service;

import java.util.ArrayList;
import java.util.List;

import com.jtf.template.dto.Employee;
import org.springframework.stereotype.Service;

@Service("EmployeeListService")
public class EmployeeService
{
    public List<Employee> getAllEmployees()
    {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Manager"));
        employees.add(new Employee(2, "Java Developer"));
        return employees;
    }

    public void addEmployees(List<Employee> employees)
    {
        employees.forEach(e -> System.out.println("Adding new employee " + e));
    }
}