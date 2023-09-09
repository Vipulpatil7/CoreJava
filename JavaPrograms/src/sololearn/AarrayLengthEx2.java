package sololearn;

public class AarrayLengthEx2 {

	public static void main(String[] args) {
		int [] a= {1,4,5,7,8};
		for(int x=0;x<a.length;x++) {
			System.out.println(a[x]);
		}
		int sum=0;
		for(int x=0;x<a.length;x++) {
			sum+=a[x];
		}
		System.out.println("--");
		System.out.println(sum);
	}

}
