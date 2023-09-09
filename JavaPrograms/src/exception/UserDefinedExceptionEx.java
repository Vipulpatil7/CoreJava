package exception;

public class UserDefinedExceptionEx {
	void validAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Invalid age");
		}
		else {
			System.out.println("Valid age");
		}
	}

	public static void main(String[] args) {
		UserDefinedExceptionEx u= new UserDefinedExceptionEx();
		u.validAge(21);

	}

}
