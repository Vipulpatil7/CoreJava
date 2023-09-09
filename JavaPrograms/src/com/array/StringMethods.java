package com.array;



public class StringMethods {

	public static void main(String[] args) {
		
//		String a="Cooking";
//		System.out.println("String a= "+a);
//		StringBuffer str=new StringBuffer("Cooking");
//		System.out.println(str);
//		str.insert(4,"Java");
//		System.out.println(str);
//		str.append("false");
//		System.out.println(str);
//		str.reverse();
//		System.out.println(str);
//		str.delete(3, 7);
//		System.out.println(str);
//		System.out.println(a.length());
		String s = "Hello";
		StringBuffer sb = new StringBuffer("Abstraction Encapsulation Inheritance");
		sb.append(" Polymorphism");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(0, 12);
		System.out.println(sb);
		sb.insert(0, "Class");
		System.out.println(sb);
		
		
	}

}
