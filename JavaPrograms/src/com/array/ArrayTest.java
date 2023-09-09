package com.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayTest {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int ar3[]= {11,22,33,44,55,66,77,88,99};
		for(int i=0;i<ar3.length;i++)
		{
			System.out.println(ar3[i]+" ");
		}
		System.out.println("Error");

	}

}
