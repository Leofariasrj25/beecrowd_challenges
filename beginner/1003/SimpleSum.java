// problem link: https://judge.beecrowd.com/en/problems/view/1003

import java.io.IOException;
import java.util.Scanner;

public class SimpleSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum = a + b;
		System.out.println("SOMA = " + sum);
		scanner.close();
	}
}
