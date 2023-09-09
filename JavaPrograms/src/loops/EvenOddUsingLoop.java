package loops;

import java.util.Scanner;

public class EvenOddUsingLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth term: ");
		int n=sc.nextInt();
		System.out.println("Even numbers upto "+ n +" terms: ");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
	}

}
