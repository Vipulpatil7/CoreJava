package collectionex;

import java.util.ArrayList;
import java.util.Scanner;

class Student2{
	int sNo;
	String sName;
	String sGrade;
	
	public Student2(int sNo, String sName, String sGrade) {
		this.sNo=sNo;
		this.sName=sName;
		this.sGrade=sGrade;
	}
}

public class ArrayListEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student2> aList = new ArrayList<Student2>();
		int choice;
		do {
			System.out.println("Enter your choice: --1 or 2 or 3 or 4");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Student details...");
				System.out.println("Enter Student RollNo: ");
				int sNo=sc.nextInt();
				System.out.println("Enter Student RollNo: ");
				String sName=sc.nextLine();
				System.out.println("Enter Student RollNo: ");
				String sGrade=sc.nextLine();
				aList.add(new Student2(sNo,sName,sGrade));
				break;
				
			case 2:
				System.out.println("Student Details are: ");
				for(Student2 st:aList) {
					System.out.println("Student Roll No: "+st.sNo);
					System.out.println("Student Name: "+st.sName);
					System.out.println("Student Grade: "+st.sGrade);
					System.out.println("---------------------");					
				}
				break;
				
			case 3:
				System.out.println("Enter index to remove student details: ");
				int n = sc.nextInt();
				aList.remove(n);
				break;
			
			case 4:
				break;
				
			default:
				System.out.println("Invali choice!!");
			
		}
			

	}while(choice!=4);
	sc.close();

}
}
