package sololearn;

public class ArrayEx4 {

	public static void main(String[] args) {
		int [] nums = {3,8,5,2};
		int res=0;
		for(int x:nums) {
			if(x>res) {
				res=x;
			}
		}
		System.out.println(res);
		// result will be 8 because in the fist round res=0 and x=3 so condition is true.... 
		//in second round res will be 3 and x will be 8 so condition is true again...
		//but in third round res will be 8 and x will be 5 so condition is false...
		//so output will be 8...
	}

}
