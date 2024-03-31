// challenge link: https://judge.beecrowd.com/en/problems/view/1002

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class CircleArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scanner.useLocale(Locale.ENGLISH);
		double radius = scanner.nextDouble();
		double pi = 3.14159;
		double area = pi * (radius * radius);
		System.out.println("A=" + String.format("%.4f", area));
		scanner.close();
	}
}
