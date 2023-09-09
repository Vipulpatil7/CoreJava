package exception;

public class ExceptionEx3 {

	public static void main(String[] args) {
			try {
				int a=10/5;
				System.out.println("value of a: "+a);
				int b[]= {1,2,3,4,5};
				b[2]=45;
				System.out.println(b[2]);
				int a1=Integer.parseInt("123");
				System.out.println(a1);
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("Divide by zero exception"+e);
			}
			catch(ArrayIndexOutOfBoundsException e1) {
				System.out.println(e1);
			}
			catch(NumberFormatException e2) {
				System.out.println(e2);
			}

	}

}
