package edu3;

public class Course {
	String courseName="";
	String[] students = new String[100];
	int numberOfStudents=0;
	
	Course(String name){
		courseName=name;
	}
	
	String getCourseName() {
		return courseName;
	}
	void addStudent(String student) {
		for(int i=0;i<100;i++) {
			if(students[i]==null) {
				students[i]=student;
				break;
			}
		}
		numberOfStudents++;
	}
	void dropStudent(String student) {
		for(int i=0;i<100;i++) {
			if(students[i]==student) {
				for(int j=i;j<99;j++) {
				students[j]=students[j+1];
				}
				for(int k=99;k>0;k--) {
					if(students[k]==students[k-1]) {
						students[k]=null;
					}
				}
			}
		}
		numberOfStudents--;
	}
	String[] getStudents() {
		return students;
	}
	int getNumberOfStudents() {
		return numberOfStudents;
	}
}
