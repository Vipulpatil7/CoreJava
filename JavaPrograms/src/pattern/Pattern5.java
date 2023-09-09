package pattern;

public class Pattern5 {
	
	public static void printPyramid(int n1){
		for(int i=1;i<=n1;i++) {
			for(int j=1;j<=n1-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printPyramid(5);

	}

}
