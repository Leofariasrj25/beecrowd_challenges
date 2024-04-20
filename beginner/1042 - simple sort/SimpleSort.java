// challenge link - https://judge.beecrowd.com/en/problems/view/1042

import java.io.IOException;
import java.util.Scanner;

public class SimpleSort {
	public static void main(String[] args) {
		int inputSize = 3;
		int input[] = new int[inputSize];
		int unsorted[] = new int[inputSize];
		Scanner reader = new Scanner(System.in);

		for (int i = 0; i < inputSize; i++) {
			input[i] = reader.nextInt();
			unsorted[i] = input[i];
		}

		reader.close();

		int sorted[] = bubbleSort(unsorted);
		printResult(sorted, input);
	}

	private static int[] bubbleSort(int[] nums) {
		boolean swapped = true;

		while (swapped) {
			swapped = false;

			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					swapped = true;
				}
			}
		}

		return nums;
	}

	private static void printResult(int[] sorted, int[] input) {
		for (int y = 0; y < sorted.length; y++) {
			System.out.println(sorted[y]);
		}

		System.out.print("\n");

		for (int z = 0; z < input.length; z++) {
			System.out.println(input[z]);
		}
	}
}
