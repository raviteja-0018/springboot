package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

import come.example.demo.error.DeptNotFoundException;

@RestController
public class DepartmentController {
	
	private final  Logger logger=LoggerFactory.getLogger(DepartmentController.class);

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/departments")
	public Department saveDept(@Valid @RequestBody Department department) {
		logger.info("Inside savedept of dept controller");
		return departmentService.saveDept(department);
	}
	
	@GetMapping("/allDeptData")
	public List<Department> getDeptDetails()
	{
		logger.info("Inside getdeptdetails of dept controller");
		return departmentService.getDeptDetails();
	}
	
	@GetMapping("/dataById/{id}")
	public Department getDeptById(@PathVariable("id") Long id) throws DeptNotFoundException
	{
		logger.info("Inside getDeptById of dept controller");
		return departmentService.getDeptById(id);
	}
	
	@DeleteMapping("/deleteId/{id}")
	public String deleteDeptById(@PathVariable("id") Long id)
	{
	   departmentService.deleteDeptById(id);	
	   return "Deleted successfully";
	}
	
	@PutMapping("/updateData/{id}")
	public Department updateDept(@PathVariable("id") Long id,@RequestBody Department department) {
		
		return departmentService.updateDept(id,department);
		
	}
	
	@GetMapping("/dataByName/{name}")
	public Department getDeptByName(@PathVariable("name") String name)
	{
		return departmentService.getDeptByName(name);
	}
	
}
