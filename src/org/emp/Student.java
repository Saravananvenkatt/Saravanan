package org.emp;

public class Student extends Employee {
	private void studentId() {
		System.out.println("123");


	}
	private void studentName() {
		System.out.println("mack");
		
		

	}
	public static void main(String[] args) {
		Student a = new Student();
		
		a.studentId();
		a.studentName();
		System.out.println();
		a.empAddress();
		System.out.println();
		a.empName();
	
	}
	
	

}
