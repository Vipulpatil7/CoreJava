package loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n,r,sum=0,temp;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check Armstrong: ");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum+= Math.pow(r, 3);
			n/=10;
		}
		if(temp==sum)
		{
			System.out.println("Number is Armstrong!!");
		}
		else
		{
			System.out.println("Number is not Armstrong!!");
		}
	}

}
