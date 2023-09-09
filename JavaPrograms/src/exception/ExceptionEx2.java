package exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			int[] numbers= {1,2,3};
			System.out.println(numbers[50]);
		}
		catch(Exception e)
		{
			System.out.println("Some error in code");
		}
		finally {
			System.out.println("THe finally statement lets you execute the code, after try..catch, "+"regardless the result");
		}
	}

}
