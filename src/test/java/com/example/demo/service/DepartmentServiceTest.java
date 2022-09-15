package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepo;

import come.example.demo.error.DeptNotFoundException;

@SpringBootTest
class DepartmentServiceTest {

	@Autowired
	private DepartmentService departmentService;
	
	@MockBean
	private DepartmentRepo departmentRepo;
	
	@BeforeEach
	void setup()
	{
		Optional<Department> dept1=Optional.of(new Department((long) 2,"IT","CBIT"));
		
		Mockito.when(departmentRepo.findById((long) 2)).thenReturn(dept1);
		
	}
	
	@Test
	public void testGetDeptById() throws DeptNotFoundException
	{
		String dept="IT";
		
		Department deptartment=departmentService.getDeptById((long) 2);
		
		assertEquals(dept, deptartment.getDeptName());
	}
}
