import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Consumption {

	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int distance = reader.nextInt();
		double fuelSpent = reader.nextDouble();
		reader.close();
		double avgFuelConsumption = distance / fuelSpent;
		System.out.println(String.format("%.3f", avgFuelConsumption) + " km/l");
	}
}
