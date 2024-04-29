//challenge link - https://judge.beecrowd.com/en/problems/view/1080

import java.util.Scanner;
import java.io.IOException;

public class HighestAndPosition {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int sequenceSize = 100;
		int index = -1;
		int highestValue = Integer.MIN_VALUE;
		int inputValue = 0;

		for (int i = 0; i < sequenceSize; i++) {
			inputValue = reader.nextInt();

			if (inputValue > highestValue) {
				highestValue = inputValue;
				index = i;
			}
		}

		reader.close();
		System.out.println(highestValue);
		System.out.println(index + 1);
	}
}
