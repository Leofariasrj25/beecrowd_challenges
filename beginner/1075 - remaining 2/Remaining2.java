// challenge link - https://judge.beecrowd.com/en/problems/view/1075

import java.util.Scanner;
import java.io.IOException;

public class Remaining2 {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		reader.close();

		for (int i = 1; i < 10_000; i++) {
			if (i % n == 2) {
				System.out.println(i);
			}
		}
	}
}
