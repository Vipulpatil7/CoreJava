package sololearn;

public class TwoDimensionalArrayEx2 {

	public static void main(String[] args) {
		int [][] arr = {{1,2},{3,4}};
		int sum=0;
		for(int x=0; x<arr.length; x++) {
			for(int y=0; y<arr[x].length;y++) {
				sum+=arr[x][y];
			}
			
		}
		System.out.println(sum);

	}

}
