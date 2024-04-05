// challenge link - https://judge.beecrowd.com/en/problems/view/1017

import java.io.IOException;
import java.util.Scanner;

public class FuelSpent {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int tripTimeInHours = reader.nextInt();
		int avgSpeedInKmh = reader.nextInt();
		reader.close();

		int distance = tripTimeInHours * avgSpeedInKmh;
		int fuelEfficiencyInKmh = 12;
		double minFuelReq = distance / (fuelEfficiencyInKmh * 1.0);
		System.out.println(String.format("%.3f", minFuelReq));
	}
}
