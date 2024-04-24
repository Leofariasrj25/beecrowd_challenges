// challenge link - https://judge.beecrowd.com/en/problems/view/1071

import java.util.Scanner;
import java.io.IOException;

public class SumOfConsecutiveOddNumbers1 {
	public static void main(String[] args) {
		run();
		// test();
	}

	public static void run() {
		Scanner reader = new Scanner(System.in);
		int start = reader.nextInt();
		int end = reader.nextInt();
		reader.close();

		int oddSum = sumConsecutiveOdds(start, end);
		System.out.println(oddSum);
	}

	public static int sumConsecutiveOdds(int start, int end) {
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

		int oddSum = 0;

		for (int i = start; i < end; i += 2) {
			oddSum += i;
		}

		return oddSum;
	}

	public static void test() {
		System.out.println(sumConsecutiveOdds(6, -5) == 5);
		System.out.println(sumConsecutiveOdds(15, 12) == 13);
		System.out.println(sumConsecutiveOdds(12, 12) == 0);
	}
}
