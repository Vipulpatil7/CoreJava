package sololearn;

import java.util.Scanner;

public class MovieTheaterTwoDimensionalArray {

	public static void main(String[] args) {
		int [][] seats = {
		{0,0,0,1,1,1,0,0,1,1},
		{1,1,0,1,0,1,1,0,0,0},
		{1,1,1,1,1,1,1,1,1,1},
		{0,0,0,1,1,1,1,0,0,0},
		{0,1,1,1,0,0,0,1,1,1}
		};
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int x=0;x<seats.length;x++) {
			for(int y=0;y<seats[x].length;y++) {
				if(x==0) {
					System.out.println("ticket is available");
				}
				else {
					System.out.println("ticket is sold");
				}
			}
		}
		
	}

}
