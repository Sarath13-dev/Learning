package org.login;
public class Student extends Employee, Bank{
private void studentId() {
	System.out.println("student id is 987");
}
	
private void studentName() {
	System.out.println("student name is raj");
}

private void studentAddress() {
	System.out.println("student address is adayar");
}

public static void main(String[] args) {
	
	Student a = new Student();
	a.studentId();
	a.studentName();
	a.studentAddress();
	a.employeeId();
	a.employeeName();
	a.employeeAddress();
	
}


}
