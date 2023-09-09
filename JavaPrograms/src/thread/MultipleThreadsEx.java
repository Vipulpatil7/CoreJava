package thread;

import java.util.Scanner;
import java.util.*;

class Multiplication implements Runnable{

	@Override
	public void run() {
		int n=4;
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}		
	}
}

class Fibonacci implements Runnable{

	@Override
	public void run() {
		int num=12;
		int f1=0,f2=1,f3;
		
		for(int i=1;i<=num;i++) {
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}	
	}	
}



class EvenOdd implements Runnable{

	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check even odd:");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Even number!!");
		}
		else {
			System.out.println("Odd number!!");
		}
		sc.close();
	}
	
}

class Factorial implements Runnable{

	@Override
	public void run() {
		System.out.println("Factorial Program");
		int i,n=5;
		int fact=1;
		for(i=1;i<=n;i++) {
			fact*=i;
			System.out.println(fact);
		}
	}	
}

public class MultipleThreadsEx {

	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		Thread t1 = new Thread(m);
		t1.start();	
		
		
		
		Fibonacci f = new Fibonacci();
		Thread t2 = new Thread(f);
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Thread Priority: "+t2.getPriority());
		
		EvenOdd e = new EvenOdd();
		Thread t3 = new Thread(e);
		t3.start();
		
		Factorial fact = new Factorial();
		Thread t4 = new Thread(fact);
		t4.start();
	}

}
