package polymorphism;

public class EmployeeInfo {
	private void employeeInfo(String name) {
		System.out.println(name);
	}
	private void employeeInfo(int id) {
		System.out.println(id);
	}
	private void employeeInfo(long mobile) {
		System.out.println(mobile);
	}
	public static void main(String[] args) {
		EmployeeInfo z = new EmployeeInfo();
		z.employeeInfo(150);
		z.employeeInfo(739727374L);
		z.employeeInfo("saro");
		z.employeeInfo(160);
		z.employeeInfo(735801724L);
		z.employeeInfo("ben");
	}
}
