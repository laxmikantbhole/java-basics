package com.dev.core;

public class Student {

	int rollNumber; // instance variable
	String name; // instance variable
	float percentage; // instance variable

	static int studCount; // static variable

	// static block - it gets called automatically when class is loading in memory
	static {
		System.out.println("In static block");
		studCount = 0;
	}

	// instance block
	{
		System.out.println("In instance block");
		studCount++; // increasing student count coz instance block gets called when new object is
						// created of Student class
	}

	// student default constructor
	Student() {
		System.out.println("Default constructor");
	}

	// parameterized constructor
	Student(int r, String n, float p) {
		this.rollNumber = r;
		this.name = n;
		this.percentage = p;
	}

	// instance function/method
	void showDetails() {
		System.out.println("RollNumber: " + this.rollNumber);
		System.out.println("Name: " + this.name);
		System.out.println("Percentage: " + this.percentage);
	}

	// static function
	static int getTotalStudentCount() {
		return studCount;
	}
}

class StudentTest {
	
	public static void main(String[] args) {
		Student s1 = new Student(10, "Fred", 70);
		Student s2 = new Student(20, "John", 74);
		
		Student s3 = new Student();
		s3.rollNumber= 30;
		s3.name = "Rob";
		s3.percentage=64f;
		
		System.out.println("Student 1 details: ");
		s1.showDetails();
		
		System.out.println("Student 2 details: ");
		s2.showDetails();
		
		System.out.println("Student 3 details: ");
		s3.showDetails();
		
		int count = Student.getTotalStudentCount();
		System.out.println("Total student count: "+ count);
		
		s3.studCount = s3.studCount+1;
		
		// accessing static variable directly
		System.out.println("Count : "+Student.studCount);
		// accessing static variable using object
		System.out.println("*Count : "+ s2.studCount);
		
		
		// calling static function using object allowed
		System.out.println("Calling static function using object: "+s1.getTotalStudentCount());
		
	}

}
