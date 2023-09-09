package pattern;

public class Pattern2 {

	public static void pattern(int n)
//	downward right angled triangle
	{
		int i,j;
		for(i=n;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(  " * ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		int n=6;
		pattern(n);
	}
	
}