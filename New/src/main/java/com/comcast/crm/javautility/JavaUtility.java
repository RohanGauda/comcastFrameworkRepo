package com.comcast.crm.javautility;

import java.util.Random;

public class JavaUtility {
	
	public int getRandomNumber(int num) {
		Random random = new Random();
		int nextInt = random.nextInt(num);
		
		return nextInt;
	}

}
