//challenge link - https://judge.beecrowd.com/en/problems/view/1079

import java.util.Scanner;
import java.io.IOException;

public class WeightedAverages {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int testCases = reader.nextInt();

		float[] weights = { 2.0f, 3.0f, 5.0f };
		float weightSum = 10.0f;
		float valueSum = 0.0f;

		while (testCases-- > 0) {
			for (int i = 0; i < 3; i++) {
				float value = reader.nextFloat() * weights[i];
				valueSum += value;
			}

			System.out.println(String.format("%.1f", valueSum / weightSum));
			valueSum = 0.0f;
		}

		reader.close();
	}
}
