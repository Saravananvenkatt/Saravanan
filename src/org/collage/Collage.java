package org.collage;

public class Collage extends Dept {
	
	private void collageName() {
		System.out.println("collage name crescent");
	}
	private void collageCode() {
		System.out.println("collage code 98765");
	}
	private void collageRank() {
		System.out.println("collage rank 1");
	}
public static void main(String[] args) {
	Collage s = new Collage();
	s.collageCode();
	s.collageName();
	s.collageRank();
	s.hostelName();
	s.deptName();
	s.studentName();
	s.studentDept();
	s.studentId();

}
}
