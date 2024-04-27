// challenge link - https://judge.beecrowd.com/en/problems/view/1078

import java.util.Scanner;
import java.io.IOException;

public class MultiplicationTable {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		reader.close();

		for (int i = 1; i <= 10; i++) {
			String op = String.format("%d x %d = %d", i, number, i * number);
			System.out.println(op);
		}
	}
}
