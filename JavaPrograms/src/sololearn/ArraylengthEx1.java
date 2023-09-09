package sololearn;

public class ArraylengthEx1 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int sum=0;
		for(int x=0;x<a.length;x++) {
			sum+=a[x];
		}
		System.out.println(sum);
	}

}
