package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
//		for loop
//		int fact=1;
//		int no=5;
//		for(int i=1;i<=no;i++)
//		{
//			fact=fact*i;
//		}
//		System.out.println("Factorial: "+fact);
		
//		while loop
		
//		int i = 1;
//		int no;
//		while(i<=no) {
//			 fact=fact*i;
//			i++;
//		}
//		System.out.println("Factorial: "+fact);		
//		int i;
//		int no=20;
//		for(i=1;i<=10;i++)
//		{
//			System.out.println(no+"*"+i+"="+(no*i));
//		}
		int i=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(i=1;i<=n;i++) {
			fact*=i;
			//i++;
		}
		System.out.println(fact);
		
	}

}
