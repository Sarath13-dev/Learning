package org.login;

public class Employee {

	public void employeeId() {
		System.out.println("employee id is 123");
	}
	
	public void employeeName() {
		System.out.println("employee name is ravi");

	}
	public void employeeAddress() {
		System.out.println("employee address is omr");
	}
	public static void main(String[] args) {
		Employee a= new Employee();
		a.employeeId();
		a.employeeName();
		a.employeeAddress();
	}
		
}
