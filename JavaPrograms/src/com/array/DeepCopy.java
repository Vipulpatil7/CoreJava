package com.array;

public class DeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int copyA[]=a.clone();
		System.out.println(a==copyA);
		for(int i=0;i<copyA.length;i++)
		{
			System.out.println(copyA[i]+" ");
		}
	}

}
