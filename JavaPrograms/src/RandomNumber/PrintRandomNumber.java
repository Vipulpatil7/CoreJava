package RandomNumber;

import java.util.Random;

public class PrintRandomNumber {

	public static void main(String[] args) {
		
		        Random random = new Random();
		        int randomNumber = random.nextInt(100) + 1;
		        System.out.println("Random number between 1 and 100: " + randomNumber);
		    }
}

	


