// challenge link - https://judge.beecrowd.com/en/problems/view/1036

import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class BhaskarasFormula {
	public static void main(String[] args) throws IOException {
		double a;
		double b;
		double c;
		Scanner reader;

		reader = new Scanner(System.in);
		a = reader.nextDouble();
		b = reader.nextDouble();
		c = reader.nextDouble();
		reader.close();

		double delta = b * b - 4 * a * c;

		if (a == 0.0 || delta < 0.0) {
			System.out.println("Impossivel calcular");
			return;
		}

		double x1 = (b * -1 + Math.sqrt(delta)) / (2 * a);
		double x2 = (b * -1 - Math.sqrt(delta)) / (2 * a);

		System.out.println("R1 = " + String.format("%.5f", x1));
		System.out.println("R2 = " + String.format("%.5f", x2));
	}
}
