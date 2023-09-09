package loops;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int n,reverse=0,remainder;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to reverse: ");
		n=sc.nextInt();
		while(n!=0)
		{
			remainder=n%10;
			reverse=reverse*10+remainder;
			n/=10;
		}
		System.out.println("Reversed number is: "+reverse);

	}

}
