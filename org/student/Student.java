package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentNAme(String name) {
		System.out.println("The student name is " + name);
	}
	
	public String studentDept(String dept) {
		return dept;
		
	}
	
	public void studentId(int number) {
		System.out.println("The student id is " + number);
	}
	public static void main(String[] args) {
	Student newComer=new Student();
	//College methods
	newComer.collegeCode();
	newComer.collegeName("Anna university");
	newComer.collegeRank();

	//Department methods 
	newComer.deptName();
	
	//Student methods
	newComer.studentDept("ECE");
	newComer.studentId(342);
	newComer.studentNAme("Aadya");
	
	}

}
