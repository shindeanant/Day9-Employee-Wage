package com.employeewageproblem;

public class EmployeeWage {

	public void employeeAttdence() {
		int empCheck = (int) (Math.random() * 10) % 2;
		System.out.println(empCheck);
		if (empCheck == 1) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the employee wage computaion problem");
		EmployeeWage object = new EmployeeWage();
		object.employeeAttdence();

	}

}
