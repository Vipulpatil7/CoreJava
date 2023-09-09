package loops;


import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int original,n,reverse=0,remainder;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check palindrome: ");
		n=sc.nextInt();
		original=n;
		while(n!=0)
		{
			remainder=n%10;
			reverse=reverse*10+remainder;
			n/=10;
		}
		if(original==reverse)
		{
			System.out.println("Number is Palindrome");
		}	
	}
}
