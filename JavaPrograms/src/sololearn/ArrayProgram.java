package sololearn;

import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {
		String[] menu= {"Tea","Espresso","Americano","Water","Hot Chocolate"};
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your choice: 1, 2, 3, 4, 5");
		int choice = sc.nextInt();
		if(choice==1) {
			System.out.println(menu[0]);
		}
		else if(choice==2){
			System.out.println(menu[1]);
		}
		else if(choice==3) {
			System.out.println(menu[2]);
		}
		else if(choice==4) {
			System.out.println(menu[3]);
		}
		else if(choice==5) {
			System.out.println(menu[4]);
		}
		else {
			System.out.println("Invalid");
		}	
		sc.close();
	}
}
