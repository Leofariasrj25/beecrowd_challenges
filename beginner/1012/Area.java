import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Area {
	public static double circleArea(double radius) {
		double pi = 3.14159;
		return (pi * (radius * radius));
	}

	public static double rectangleArea(double length, double width) {
		return (length * width);
	}

	public static double squareArea(double side) {
		return (side * side);
	}

	public static double trapeziumArea(double sideA, double sideB, double height) {
		return ((sideA + sideB) / 2.0 * height);
	}

	public static double triangleArea(double base, double height) {
		return ((1 / 2.0) * base * height);
	}

	public static String formatToDoubleStr(double val) {
		return String.format("%.3f", val);
	}

	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		double a, b, c;
		a = reader.nextDouble();
		b = reader.nextDouble();
		c = reader.nextDouble();
		reader.close();

		System.out.println("TRIANGULO: " + formatToDoubleStr(triangleArea(a, c)));
		System.out.println("CIRCULO: " + formatToDoubleStr(circleArea(c)));
		System.out.println("TRAPEZIO: " + formatToDoubleStr(trapeziumArea(a, b, c)));
		System.out.println("QUADRADO: " + formatToDoubleStr(squareArea(b)));
		System.out.println("RETANGULO: " + formatToDoubleStr(rectangleArea(a, b)));
	}
}
