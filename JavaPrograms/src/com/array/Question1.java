package com.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int ar[]=new int[7];
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Enter the element at "+ i +" index position");
			ar[i]=Integer.parseInt(bufferedReader.readLine());
			
		}
		int addition=0;
		for(int i=0;i<ar.length;i++) 
			
		{
			addition+=ar[i];
		}
		System.out.println("Addition of array elements is : "+addition);
	}

}