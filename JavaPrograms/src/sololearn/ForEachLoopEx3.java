package sololearn;

public class ForEachLoopEx3 {

	public static void main(String[] args) {
		int [] a= {12,3,4,6,5};
		int sum=0;
		for(int x : a) {
			sum+=x;
		}
		System.out.println(sum);
	}

}
