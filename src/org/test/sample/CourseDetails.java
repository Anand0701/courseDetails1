package org.test.sample;

public class CourseDetails {
//method 
	private void JavaCourse() {
		System.out.println("Java Course is started");
	}
	private void JavaCourse1() {
		System.out.println("Java Course yet to be started");
	}
	private void JavaCourse2() {
		System.out.println("Java Course not started");
	}
	public static void main(String[] args) {
	//classname objectname/reference name=new classname ();
			CourseDetails cd=new CourseDetails();
			cd.JavaCourse();
			cd.JavaCourse1();
	}
}
