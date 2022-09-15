package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	

	@NotBlank(message = "Please enter dept name ")
	@Length(max = 5,min = 2)
	private String deptName;
	@NotNull
	private String deptAddress;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptAddress() {
		return deptAddress;
	}
	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}
	public Department(Long id, @NotBlank(message = "Please enter dept name ") @Length(max = 5, min = 2) String deptName,
			@NotNull String deptAddress) {
		super();
		this.id = id;
		this.deptName = deptName;
		this.deptAddress = deptAddress;
	}
	public Department() {
		super();
	}
	
}
