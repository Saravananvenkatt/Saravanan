package polymorphism;

public class EmployeeDetails extends Employee {
 
@Override
	public void empName() {
		
	System.out.println("Ravi");
	
	}	
	
public void empId() {
	 
	 
	 System.out.println("888");
	 super.empAge();
	 
}
  
	public static void main(String[] args) {
		EmployeeDetails s = new EmployeeDetails();
		
		
		s.empName();
		s.empId();
	}
}