package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.Entity.employee;

@Repository
public interface employeeRepo extends JpaRepository<employee, Long>{

	
	
}
