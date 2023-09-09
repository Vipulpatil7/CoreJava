package sololearnMethods;

//Method example using multiple parameters

public class MethodEx2 {

		static void welcome(int id, String name, String city) {
			System.out.println("Welcome, "+id+" "+name+" "+city);
			//System.out.println("Id: "+id);
		}
	public static void main(String[] args) {
		welcome(1,"Vipul", "Kolhapur");
		welcome(2,"Pratik", "Nashik");
	}

}
