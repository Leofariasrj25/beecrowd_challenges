// challenge link - https://judge.beecrowd.com/en/problems/view/1064

import java.util.Scanner;
import java.io.IOException;
import java.lang.Number;

public class PositiveAndAverages {
	public static void main(String[] args) {
		int inputSize = 6;
		Number values[] = readPositiveValues(inputSize);
		float average = values[1].floatValue() / values[0].intValue();

		System.out.println(values[0] + " valores positivos");
		System.out.println(String.format("%.1f", average));
	}

	public static Number[] readPositiveValues(int inputSize) {
		Scanner reader = new Scanner(System.in);
		int positiveQtty = 0;
		float num = 0.0f;
		float sum = 0.0f;

		for (int i = 0; i < inputSize; i++) {
			num = reader.nextFloat();

			if (num > 0.0f) {
				sum += num;
				positiveQtty++;
			}
		}

		reader.close();
		return new Number[] { positiveQtty, sum };
	}
}
