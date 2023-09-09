package sololearn;

public class MultidimensionalArrayEx3 {

	public static void main(String[] args) {
		int [] dates= {2000,2000,2001,2002,2000,2004};
		int count=0;
		for(int x=0;x<dates.length;x++) {
			if(dates[x]==2000) {
				count++;
			}
		}
		System.out.println(count);

	}

}
