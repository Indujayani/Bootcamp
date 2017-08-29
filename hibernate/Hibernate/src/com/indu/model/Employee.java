package com.indu.model;

import java.util.HashSet;
import java.util.Set;

public class Employee {

	
	private int empId;
	private String name;
	private int age;
	AllocationData allocationData;
	Set<AllocationHistory> histories;

	public Employee()
	{
		allocationData=new AllocationData();
		histories=new HashSet<>();
	}
	

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	
	public AllocationData getAllocationData() {
		return allocationData;
	}
	public void setAllocationData(AllocationData allocationData) {
		this.allocationData = allocationData;
	}
	
	public Set<AllocationHistory> getHistories() {
		return histories;
	}


	public void setHistories(Set<AllocationHistory> histories) {
		this.histories = histories;
	}

//	public void addAllocationHistory(AllocationHistory allocationHistory)
//	{
//		allocationHistory.setEmployee(this);
//		histories.add(allocationHistory);
//		
//	}
//	
	
	
}
