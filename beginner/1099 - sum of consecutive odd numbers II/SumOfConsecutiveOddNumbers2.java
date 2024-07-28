// challenge link: https://judge.beecrowd.com/en/problems/view/1099

import java.io.IOException;
import java.util.Scanner;

public class SumOfConsecutiveOddNumbers2 {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int cases = reader.nextInt();

		while (cases-- > 0) {
			int start = reader.nextInt();
			int end = reader.nextInt();

			if (start > end) {
				int temp = start;
				start = end;
				end = temp;
			}

			if (start % 2 == 0) {
				start++;
			} else {
				start += 2;
			}

			if (end % 2 == 0) {
				end--;
			} else {
				end -= 2;
			}

			int i = start;
			int sum = 0;

			while (i <= end) {
				sum += i;
				i += 2;
			}

			System.out.println(sum);

		}

		reader.close();
	}
}
