// challenge link - https://judge.beecrowd.com/en/problems/view/1007

import java.io.IOException;
import java.util.Scanner;

public class Difference {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		int d = reader.nextInt();
		System.out.println("DIFERENCA = " + (a * b - c * d));
		reader.close();
	}
}
