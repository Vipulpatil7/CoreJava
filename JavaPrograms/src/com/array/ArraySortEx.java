package com.array;

public class ArraySortEx {

		static int getSecondSmallestNumber(int[] arr) {
			int temp;
			for(int i=0;i<=arr.length;i++)
			{
				for(int j=i;j<=arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				System.out.print(arr[i]+" ");
			}
			return arr[1];
		}
	public static void main(String[] args) {
		int arr[]= {5,2,7,8,4};
		System.out.println(getSecondSmallestNumber(arr));
	}

}
