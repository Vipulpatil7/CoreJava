package doselect;

@FunctionalInterface
interface StringSpace{
	String addSpace(String str);
}

public class Spacing {

	public static void main(String[] args) {
		
		StringSpace S=(String str)->{
			for(int i=0;i<str.length();i++) {
				char c = str.charAt(i);
				System.out.print(c+" ");
			}
			return str;
		};
		S.addSpace("Capgemini");
	}

}
