package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Student_Test {

	@BeforeClass
	public static void setup() throws PersonException {
		ArrayList<Student> studentList = new ArrayList();
		Student A = new Student("Lucy", "Wilhelm", "Stratofsky",new Date(1987,12,2), eMajor.CHEM,"365 Boring Street", "1234567890","grossemail@email.com");
		Student B = new Student("Brigitte", "Reinhardt", "Lindholm", new Date(1987,12,2),eMajor.COMPSI, "325 Overwatch St.", "0122589345","daddyTorb@meme.edu");
		Student C = new Student("Your", "Loving", "Mother",new Date(1987,12,2), eMajor.NURSING,"365 Boring Street", "1234567890","qwertyemail@email.com");
		Student D = new Student("Randy", "Manly", "Savage",new Date(1987,12,2), eMajor.PHYSICS,"365 Boring Street", "1234567890","qwertyemail@email.com");
		Student E = new Student("Donald", "J", "Trump",new Date(1987,12,2),eMajor.BUSINESS, "365 Boring Street", "1234567890","qwertyemail@email.com");
		Student F = new Student("Lucy", "Wilhelm", "Stratofsky",new Date(1987,12,2), eMajor.CHEM,"365 Boring Street", "1234567890","grossemail@email.com");
		Student G = new Student("Brigitte", "Reinhardt", "Lindholm", new Date(1987,12,2),eMajor.COMPSI, "325 Overwatch St.", "0122589345","daddyTorb@meme.edu");
		Student H = new Student("Your", "Loving", "Mother",new Date(1987,12,2), eMajor.NURSING,"365 Boring Street", "1234567890","qwertyemail@email.com");
		Student I = new Student("Randy", "Manly", "Savage",new Date(1987,12,2), eMajor.PHYSICS,"365 Boring Street", "1234567890","qwertyemail@email.com");
		Student J = new Student("Donald", "J", "Trump",new Date(1987,12,2),eMajor.BUSINESS, "365 Boring Street", "1234567890","qwertyemail@email.com");
		
		studentList.add(A);
		studentList.add(B);
		studentList.add(C);
		studentList.add(D);
		studentList.add(E);
		studentList.add(F);
		studentList.add(G);
		studentList.add(H);
		studentList.add(J);
		
		ArrayList<Course> courseList = new ArrayList();
		Course Memes = new Course(UUID.randomUUID(),"Intro to Memes",2,eMajor.BUSINESS);
		Course Chem = new Course(UUID.randomUUID(),"Intro to Chem",4,eMajor.CHEM);
		Course Physics = new Course(UUID.randomUUID(),"Intro to Physics",4,eMajor.PHYSICS);
		courseList.add(Memes);
		courseList.add(Chem);
		courseList.add(Physics);
		
		ArrayList<Semester> semesterList = new ArrayList();
		Semester spring = new Semester(UUID.randomUUID(),new Date(),new Date());
		Semester fall = new Semester(UUID.randomUUID(),new Date(),new Date());
		semesterList.add(spring);
		semesterList.add(fall);
		
		ArrayList<Section> sectionList = new ArrayList();
		
		
	}

	@Test
	public void test() {
		
	}
}