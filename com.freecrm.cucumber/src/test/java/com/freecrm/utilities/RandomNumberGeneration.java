package com.freecrm.utilities;

import java.util.Random;

public class RandomNumberGeneration {
	
	
	public int getRandomNumber(){
		
		Random random = new Random();
		
		int randomNumber= random.nextInt(1000);
		return randomNumber;
	}
	
	

}
