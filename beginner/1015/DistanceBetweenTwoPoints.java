import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class DistanceBetweenTwoPoints {

	public static double squareDifference(double a, double b) {
		return (a * a - 2 * a * b + b * b);
	}

	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		double x1 = reader.nextDouble();
		double y1 = reader.nextDouble();
		double x2 = reader.nextDouble();
		double y2 = reader.nextDouble();
		reader.close();
		double distance = Math.sqrt(squareDifference(x2, x1) + squareDifference(y2, y1));
		System.out.println(String.format("%.4f", distance));
	}
}
