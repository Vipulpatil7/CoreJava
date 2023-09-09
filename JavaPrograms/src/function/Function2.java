package function;

public class Function2 {
	
	static String equalString(String s1, String s2)
	{
		if(s1.equalsIgnoreCase(s2)) {
			return "equal";
		}
		else return "not equal";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(equalString("Vipul", "vipul"));
	}

}
