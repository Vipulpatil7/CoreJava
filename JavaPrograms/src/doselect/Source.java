package doselect;

import java.util.Arrays;

public class Source {
	public int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

	public static void main(String[] args) {
		Source s = new Source();
		int[] arr= {23,45,32,22,24,96};
		System.out.println(s.getSecondSmallest(arr));

	}

}
