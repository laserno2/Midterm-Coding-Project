package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
		
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void test() throws PersonException {
		ArrayList<Staff> staffList = new ArrayList();
		Staff A = new Staff("Lucy", "Wilhelm", "Stratofsky",new Date(1987,12,2), "365 Boring Street", "1234567890","grossemail@email.com","9-18", 2, 0.05, new Date(1987,12,2),eTitle.MRS);
		
		Staff B = new Staff("Brigitte", "Reinhardt", "Lindholm", new Date(1987,12,2), "325 Overwatch St.", "0122589345","daddyTorb@meme.edu","9-1", 5, 400000, new Date(1987,12,2),eTitle.MS);
		
		Staff C = new Staff("Your", "Loving", "Mother",new Date(1987,12,2), "365 Boring Street", "1234567890","qwertyemail@email.com","9-5", 2, 50000, new Date(1987,12,2),eTitle.MRS);
		
		Staff D = new Staff("Randy", "Manly", "Savage",new Date(1987,12,2), "365 Boring Street", "1234567890","qwertyemail@email.com","9-5", 2, 100, new Date(1987,12,2),eTitle.MR);
		
		Staff E = new Staff("Donald", "J", "Trump",new Date(1987,12,2), "365 Boring Street", "1234567890","qwertyemail@email.com","9-5", 2, 5000000, new Date(1987,12,2),eTitle.MR);
		
		staffList.add(A);
		staffList.add(B);
		staffList.add(C);
		staffList.add(D);
		staffList.add(E);
		
		double totalSalary = 0;
		int numEmployees = 0;
		for (Staff person: staffList) {
			numEmployees++;
			totalSalary+= person.getSalary();
		}
		assertEquals(1090020.01,totalSalary/numEmployees);
	}	

}
