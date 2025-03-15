package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	private final EmployeeRepository repository;

	public EmployeeService(EmployeeRepository repository) {
		this.repository = repository;
	}

	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	public Optional<Employee> findEmployeeById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
