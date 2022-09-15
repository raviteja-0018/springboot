package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepo;

import come.example.demo.error.DeptNotFoundException;

@Service
public class DepartmentService {
   @Autowired
	private DepartmentRepo departmentRepo;
	public Department saveDept(Department department) {
		// TODO Auto-generated method stub
		return departmentRepo.save(department);
	}
	public List<Department> getDeptDetails() {
		// TODO Auto-generated method stub
		return departmentRepo.findAll();
	}
	public Department getDeptById(Long id) throws DeptNotFoundException {
		// TODO Auto-generated method stub
		//return departmentRepo.findById(id).get();
		Optional<Department> dept=departmentRepo.findById(id);
		
		if(!dept.isPresent())
		{
			throw new DeptNotFoundException("Department is not found");
		}
		
		return dept.get();
	}
	public void deleteDeptById(Long id) {
		// TODO Auto-generated method stub
		departmentRepo.deleteById(id);;
	}
	public Department updateDept(Long id,Department department) {
		// TODO Auto-generated method stub
		Department dept=departmentRepo.findById(id).get();
		if(dept.getDeptName()!=null)
		{
			dept.setDeptName(department.getDeptName());
		}
		if(dept.getDeptAddress()!=null)
		{
			dept.setDeptAddress(department.getDeptAddress());
		}
		
		return departmentRepo.save(dept);
	}
	public Department getDeptByName(String name) {
		// TODO Auto-generated method stub
		return departmentRepo.getByDeptNameIgnoreCase(name);
	}

	
}
