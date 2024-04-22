// challenge link - https://judge.beecrowd.com/en/problems/view/1060

import java.io.IOException;
import java.util.Scanner;

public class PositiveNumbers {
	public static void main(String[] args) throws IOException {
		int cases = 6;
		int positiveAmount = 0;
		Scanner reader = new Scanner(System.in);

		for (int i = 0; i < cases; i++) {
			double num = reader.nextFloat();

			if (num > 0.0) {
				positiveAmount++;
			}
		}

		reader.close();
		System.out.println(positiveAmount + " valores positivos");
	}
}
