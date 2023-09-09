package java8;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		int a=15; //Decimal
		String b = Integer.toBinaryString(a);//convert Decimal to Binary
		System.out.println(b);
		
		String f = Integer.toHexString(a);//convert Decimal to HexaDecimal
		System.out.println(f);
		
		String c = Integer.toOctalString(a);//convert Decimal to Octal
		System.out.println(c);

	}

}
