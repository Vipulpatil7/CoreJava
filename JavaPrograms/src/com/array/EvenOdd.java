package com.array;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check even or odd: ");
		int x = sc.nextInt();
		if(x%2==0)
		{
			System.out.println("Even Number!!");
		}
		else
		{
			System.out.println("Odd Number");
		}
		
	}

}
