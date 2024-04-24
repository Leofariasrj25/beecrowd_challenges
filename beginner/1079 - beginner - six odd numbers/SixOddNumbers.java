//challenge link - https://judge.beecrowd.com/en/problems/view/1070

import java.io.IOException;
import java.util.Scanner;

public class SixOddNumbers {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int x = reader.nextInt();
		reader.close();

		int oddAmount = 6;

		if (x % 2 == 0) {
			x++;
		}

		while (oddAmount != 0) {
			System.out.println(x);
			x += 2;
			oddAmount--;
		}
	}
}
