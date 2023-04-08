package com.ibm.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import com.ibm.Entity.Employee;
import com.ibm.Repo.Repository;

public class Runner implements ApplicationRunner {
	@Autowired
	private Repository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Employee emp=new Employee();
		emp.setEmpid(143);
		emp.setEmpname("ravi");
		emp.setEsalary(3000.00);
		Employee save = repo.save(emp);
		System.out.println(save);
		

	}

}
