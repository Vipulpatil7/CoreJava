package sololearn;

public class TwoDimensionalArrayEx1 {

	public static void main(String[] args) {
		int [][] sample = {{1,2},{3,4},{5,6}};
		for(int x=0;x<sample.length-1;x++) {
			for(int y=0;y<sample[x].length;y++) {
				System.out.print(sample[x][y]);
			}
		}
//		int x = sample[2][1];
//		System.out.println(x);

	}

}
