package sololearnMethods;

import java.util.Scanner;

public class MethodEx2BOT {
	
	static void bot() {
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		if(input==1) {
			System.out.println("Order confirmed");
		}
		else if(input==2) {
			System.out.println("info@sololearn.com");
		}
		else {
			System.out.println("Try again");
		}
	}

	public static void main(String[] args) {
		bot();

	}

}
