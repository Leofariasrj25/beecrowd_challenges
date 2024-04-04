import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Sphere {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		double radius = reader.nextDouble();
		reader.close();
		double pi = 3.14159;
		double volume = (4 / 3.0) * pi * Math.pow(radius, 3);
		System.out.println("VOLUME = " + String.format("%.3f", volume));
	}
}
