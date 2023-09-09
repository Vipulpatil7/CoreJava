package doselect;

import java.util.Scanner;

public class DistanceTravelled {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int velocity_in_Km=36;
		int velocity_in_meters=velocity_in_Km*1000;
		int constant_accelaration=5;

		System.out.println("enter the time interval");
		int Time_interval=sc.nextInt();

		int distance_travlled= (velocity_in_meters*Time_interval)/3600+((constant_accelaration*Time_interval*Time_interval)/2);
		System.out.println(distance_travlled);
		
		Scanner scanner = new Scanner(System.in);		 
		int timeInterval1 = scanner.nextInt();
		int timeInterval2 = scanner.nextInt();
		 	
		double distance1 = calculateDistance(timeInterval1);
		double distance2 = calculateDistance(timeInterval2);
	 
	// Output the variable to STDOUT
	 	System.out.println((int) distance1);
		System.out.println((int) distance2);
		}
		private static double calculateDistance(int timeInterval){
		double initialvelocity = 36*1000/3600.0;
		double distance = initialvelocity*timeInterval + (0.5*5*Math.pow(timeInterval,2));
		return distance;
	}
}
