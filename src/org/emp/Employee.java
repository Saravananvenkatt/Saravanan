package org.emp;


public class Employee extends Staff {  //parent class

public void empLocation() {
	System.out.println("chennai");

}
public void empExperiance() {
	System.out.println("5years");
	 
}

public static void main(String[] args) {
	Employee z = new Employee();
	z.empLocation();
	z.empExperiance();
	
			

}
}
