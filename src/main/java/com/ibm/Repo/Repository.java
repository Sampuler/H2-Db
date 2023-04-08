package com.ibm.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.Entity.Employee;

public  interface Repository  extends JpaRepository<Employee, Integer>{
	
	
}
