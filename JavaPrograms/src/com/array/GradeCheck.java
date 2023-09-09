package com.array;

import java.util.Scanner;

public class GradeCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks to check Grade: ");
		int mks = sc.nextInt();
		if(mks>=90)
		{
			System.out.println("A Grade");
		}
		else if(mks<90 && mks>=80)
		{
			System.out.println("B Grade");
		}
		else if(mks<80 && mks>=70) 
		{
			System.out.println("C Grade");
		}
		else if(mks<70 && mks>50)
		{
			System.out.println("D Grade");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
