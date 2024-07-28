// challenge link - https://judge.beecrowd.com/en/problems/view/1101

import java.util.Scanner;
import java.io.IOException;

public class SequenceOfNumbersAndSum {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);

		while (true) {
			int start = reader.nextInt();
			int finish = reader.nextInt();

			if (start <= 0 || finish <= 0) {
				break;
			}

			if (start > finish) {
				int temp = start;
				start = finish;
				finish = temp;
			}

			int sum = 0;
			int i = start;

			while (i <= finish) {
				System.out.print(i + " ");
				sum += i;
				i++;
			}

			System.out.println("Sum=" + sum);
		}

		reader.close();
	}
}
