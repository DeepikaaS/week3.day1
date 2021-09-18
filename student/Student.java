package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("The name of Student:Deepikaa");

	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("The Department:IT");

	}
	public void studentId() {
	// TODO Auto-generated method stub
		System.out.println("The studentID:21170");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		System.out.println("The Student info:");
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		System.out.println("");
		System.out.println("The Department Info:");
		obj.deptName();
		System.out.println("");
		System.out.println("The College Info:");
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		
	}

}
