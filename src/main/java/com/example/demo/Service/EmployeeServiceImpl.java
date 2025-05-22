package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Entity.employee;


import com.example.demo.Repository.employeeRepo;

public class EmployeeServiceImpl {


	@Autowired 
	employeeRepo repository;
    public employee saveEmployee(employee employee) {
        return repository.save(employee);
    }


    public List<employee> getAllEmployees() {
        return repository.findAll();
    }


    public employee getEmployeeById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public employee updateEmployee(Long id, employee updatedEmployee) {
        employee employee = getEmployeeById(id);
        employee.setName(updatedEmployee.getName());
        employee.setEmail(updatedEmployee.getEmail());
        employee.setDepartment(updatedEmployee.getDepartment());
        return repository.save(employee);
    }


    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}
