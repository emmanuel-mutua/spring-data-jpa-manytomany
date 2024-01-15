package com.dev2prod.manytomany.employee.service;

import com.dev2prod.manytomany.employee.entity.Employee;
import com.dev2prod.manytomany.project.entity.Project;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.plaf.PanelUI;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeServiceTest {
    @Autowired
    public EmployeeService employeeService;

    @Test
    void saveEmployee() {
        Project project = Project.builder()
                .projectName("AI Research")
                .build();
        Employee employee = Employee.builder()
                .empName("Emmanuel")
                .build();
        employee.addProjects(project);
        employeeService.saveEmployee(employee);
    }

    @Test
    void getEmployeeDetails() {
        List<Employee> employees = employeeService.getEmployeeDetails(2L);
        System.out.println(employees);
    }

    @Test
    void deleteEmployee() {
    }

    @Test
    void assignProjectToEmployee() {
    }
}