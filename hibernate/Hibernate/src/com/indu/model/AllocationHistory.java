package com.indu.model;

public class AllocationHistory {

	private String projectCode;
	private String projectName;
	
//	private int employeeID;
//	
//	private Employee employee;
	
	
	public AllocationHistory()
	{
		
	}
	public AllocationHistory(String pcode,String pname)
	{
		this.projectCode=pcode;
		this.projectName=pname;
		
	}
	
	
	public String getProjectCode() {
		return projectCode;
	}
	
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
//	public int getEmployeeID() {
//		return employeeID;
//	}
//	public void setEmployeeID(int employeeID) {
//		this.employeeID = employeeID;
//	}
//	public Employee getEmployee() {
//		return employee;
//	}
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
	
	
	
}
