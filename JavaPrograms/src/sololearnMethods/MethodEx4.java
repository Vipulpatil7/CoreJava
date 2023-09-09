package sololearnMethods;

public class MethodEx4 {

//	static void sum(int a, int b) {
//		System.out.println(a+b);
//	}
//	public static void main(String[] args) {
//		int x=8;
//		int y=11;
//		sum(x,y);
//
//	}
	
	static void perc(double num, int percentage) {
		double res=num*percentage/100;
		System.out.println(res);
	}
	public static void main(String[] args) {
		perc(520,25);
	}
}
