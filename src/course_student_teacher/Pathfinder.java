package course_student_teacher;

import java.util.Scanner;

public class Pathfinder {

	public void getCourse(String abc) {
		if(abc.equals("CSE501")) {
			ICourse course = new CSE501();
			task(course);
			
		}
		else if(abc.equals("SE506")) {
			ICourse course = new SE506();
			task(course);
		}
		 
		
	}
	
	public void task(ICourse c) {
		System.out.println("1. getCourseName.\n 2. beTeacher.\n 3.beStudent");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(input == 1) {
			c.name();
		}
		else if(input == 2) {
			c.teacher();
		}
		else if(input == 3) {
			c.student();
		}
		sc.close();
	}
}
