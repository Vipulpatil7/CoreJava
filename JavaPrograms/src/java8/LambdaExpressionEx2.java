package java8;


//interface Myinterface{
//	//int add(int a,int b);
//	//int mul(int a,int b);	
//	
//}
interface EvenOdd{
	int evod(int a);
}

public class LambdaExpressionEx2 {

	public static void main(String[] args) {
//		Myinterface mf = (int a,int b)->a*b;
//		System.out.println("Multiplication  is :...."+mf.mul(4, 7));
		
		EvenOdd eo = (int a)->
		{if(a%2==0)
			System.out.print("even no: ");
		else
			System.out.print("odd no: ");
		return a;
		};
		System.out.println(eo.evod(8));
		
	}

}
