import java.io.IOException;
import java.util.Scanner;

public class Interval2 {
	public static void main(String[] args) throws IOException {
		run();
		// test();
	}

	public static void run() {
		Scanner reader = new Scanner(System.in);
		int inputSize = reader.nextInt();
		int numbers[] = new int[inputSize];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = reader.nextInt();
		}

		reader.close();
		int start = 10;
		int end = 20;

		// 0 - in
		// 1 - out
		int inOut[] = getInAndOutOfIntervalSizes(numbers, start, end);
		System.out.println(inOut[0] + " in");
		System.out.println(inOut[1] + " out");
	}

	public static int[] getInAndOutOfIntervalSizes(int[] numbers, int start, int end) {
		int in = 0;
		int out = 0;

		for (int num : numbers) {
			if (num >= start && num <= end) {
				in++;
			} else {
				out++;
			}
		}

		return new int[] { in, out };
	}

	public static void test() {
		// 0 - in
		// 1 - out

		int test1[] = { 14, 123, 10, -25 };
		int inOut1[] = getInAndOutOfIntervalSizes(test1, 10, 20);
		System.out.println(inOut1[0] == 2 && inOut1[1] == 2);

		int test2[] = { 1, 2, 3, 4, 5 };
		int inOut2[] = getInAndOutOfIntervalSizes(test2, 1, 5);
		System.out.println(inOut2[0] == 5 && inOut2[1] == 0);

		int test3[] = { 1, 2, 3, 4, 5 };
		int inOut3[] = getInAndOutOfIntervalSizes(test3, 6, 6);
		System.out.println(inOut3[0] == 0 && inOut3[1] == 5);

	}
}
