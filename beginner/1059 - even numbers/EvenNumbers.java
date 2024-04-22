//challenge link - https://judge.beecrowd.com/en/problems/view/1059

import java.util.Scanner;
import java.io.IOException;

public class EvenNumbers {
	public static void main(String[] args) throws IOException {
		printEvenNumbers();
	}

	public static void printEvenNumbers() {
		int start = 1;
		int end = 100;

		if (start % 2 != 0) {
			start++;
		}

		for (int i = start; i <= end; i += 2) {
			System.out.println(i);
		}
	}
}
