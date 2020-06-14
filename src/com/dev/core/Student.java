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
  }
  
  
  
  
  public static void main(String[] args) {
	System.out.println("Hello World!!!");
}


}
