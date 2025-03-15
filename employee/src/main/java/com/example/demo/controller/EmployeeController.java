package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	private final EmployeeService service;

	public EmployeeController(EmployeeService service) {
		this.service = service;
	}

	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee) {
		Employee saveEmployee = service.saveEmployee(employee);
		return saveEmployee;

	}

	@GetMapping
	public List<Employee> getEmployee() {
		return service.getEmployee();
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		service.deleteById(id);
	}

	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
		Optional<Employee> ExistingEmployee = service.findEmployeeById(id);
		Employee em = null;
		if (ExistingEmployee.isPresent()) {
			em = ExistingEmployee.get();

			if (em.getName() != employee.getName())
				em.setName(employee.getName());

			if (em.getAddress() != employee.getAddress())
				em.setAddress(employee.getAddress());

			if (em.getAge() != employee.getAge())
				em.setAge(employee.getAge());

			if (em.getDesignation() != employee.getDesignation())
				em.setDesignation(employee.getDesignation());

			if (em.getSalary() != employee.getSalary())
				em.setSalary(employee.getSalary());
		}
		return service.saveEmployee(em);
	}
}
