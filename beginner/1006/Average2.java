// challenge link - https://judge.beecrowd.com/en/problems/view/1006

import java.io.IOException;
import java.util.Scanner;

public class Average2 {
	public static void main(String[] args) {
		double[] weights = { 2, 3, 5 };
		double gradeSum = 0.0;
		double weightSum = 0.0;
		Scanner reader = new Scanner(System.in);

		for (int i = 0; i < weights.length; i++) {
			gradeSum += reader.nextDouble() * weights[i];
			weightSum += weights[i];
		}

		double average = gradeSum / weightSum;
		System.out.println("MEDIA = " + String.format("%.1f", average));
		reader.close();
	}
}
