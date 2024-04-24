// challenge link - https://judge.beecrowd.com/en/problems/view/1073

import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class EvenSquare {
	public static void main(String[] args) throws IOException {
		run();
		// test();
	}

	public static void run() {
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		reader.close();

		if (num % 2 == 0) {
			num++;
		}

		int evenSquares[] = calculateSquares(num);

		for (int i = 2, j = 0; i < num; i += 2, j++) {
			System.out.println(i + "^2 = " + evenSquares[j]);
		}
	}

	public static int[] calculateSquares(int num) {
		int evenSquares[] = new int[num / 2];

		for (int i = 2, j = 0; i < num; i += 2, j++) {
			evenSquares[j] = (int) Math.pow(i, 2);
		}

		return evenSquares;
	}
}
