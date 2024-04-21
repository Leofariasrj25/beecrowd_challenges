// challenge link - 

import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class TriangleTypes {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		double sides[] = new double[3];

		for (int i = 0; i < sides.length; i++) {
			sides[i] = reader.nextDouble();
		}

		reader.close();

		decreasingSort(sides);
		double a = sides[0];
		double b = sides[1];
		double c = sides[2];

		if (!isValidTriangle(a, b, c)) {
			System.out.println("NAO FORMA TRIANGULO");
			return;
		}

		if (isRectangleTriangle(a, b, c)) {
			System.out.println("TRIANGULO RETANGULO");
		}

		if (isObtuseTriangle(a, b, c)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}

		if (isAcuteTriangle(a, b, c)) {
			System.out.println("TRIANGULO ACUTANGULO");
		}

		if (isEquilateralTriangle(a, b, c)) {
			System.out.println("TRIANGULO EQUILATERO");
		}

		if (isIsolecesTriangle(a, b, c)) {
			System.out.println("TRIANGULO ISOCELES");
		}
	}

	public static void decreasingSort(double[] nums) {
		boolean swapped = true;

		while (swapped) {
			swapped = false;

			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] < nums[i + 1]) {
					double temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
					swapped = true;
				}
			}
		}
	}

	public static boolean isValidTriangle(double a, double b, double c) {
		return a < (b + c);
	}

	public static boolean isEquilateralTriangle(double a, double b, double c) {
		return a == b && b == c;
	}

	public static boolean isIsolecesTriangle(double a, double b, double c) {
		return (a == b && b != c) || (a == c && a != b) || (b == c && b != a);
	}

	public static boolean isAcuteTriangle(double a, double b, double c) {
		return Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2));
	}

	public static boolean isObtuseTriangle(double a, double b, double c) {
		return Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2));
	}

	public static boolean isRectangleTriangle(double a, double b, double c) {
		return Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2));
	}
}
