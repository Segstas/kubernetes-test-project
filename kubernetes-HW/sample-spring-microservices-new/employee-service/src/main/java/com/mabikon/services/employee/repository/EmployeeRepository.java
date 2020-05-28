package com.mabikon.services.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mabikon.services.employee.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
	
	List<Employee> findByDepartmentId(Long departmentId);
	List<Employee> findByOrganizationId(Long organizationId);
	
}
