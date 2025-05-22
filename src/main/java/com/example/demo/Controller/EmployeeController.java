package com.example.demo.Controller;
import com.example.demo.Entity.employee;
import com.example.demo.Service.EmployeeServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl service;

    @PostMapping
    public employee create(@RequestBody employee employee) {
        return service.saveEmployee(employee);
    }

    @GetMapping
    public List<employee> getAll() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public employee getById(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public employee update(@PathVariable Long id, @RequestBody employee employee) {
        return service.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteEmployee(id);
        return "Employee deleted";
    }

}
