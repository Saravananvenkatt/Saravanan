package polymorphism;

public class Employee { 
     void empName() {
		System.out.println("saro");
	}
 void empId() {
		System.out.println("777");
	}
	 void empAge() {
		System.out.println("28");
	}
	public static void main(String[] args) {
		Employee s = new Employee();
		s.empAge();
		s.empId();
		s.empName();
	}

}
