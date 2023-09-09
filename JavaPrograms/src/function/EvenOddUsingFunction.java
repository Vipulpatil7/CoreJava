package function;

import java.io.*;


public class EvenOddUsingFunction {
	void EvenOddUsingFunction(int no)
	{
		if(no%2==0)
		{
			System.out.println(no + " is even");
		}
		else
		{
			System.out.println(no + " is odd");
		}
	}

	public static void main(String[] args)throws NumberFormatException, IOException {
		EvenOddUsingFunction e = new EvenOddUsingFunction();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		int no=Integer.parseInt(br.readLine());
		e.EvenOddUsingFunction(no);
		
	}

}
