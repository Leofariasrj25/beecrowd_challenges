// challenge link - https://judge.beecrowd.com/en/problems/view/1044

import java.io.IOException;
import java.util.Scanner;

public class Multiples {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int numA = reader.nextInt();
		int numB = reader.nextInt();
		reader.close();

		if (numA < numB) {
			int temp = numA;
			numA = numB;
			numB = temp;
		}

		int remainder = 0;
		String msg;

		if (numB != 0) {
			remainder = numA % numB;
		}

		if (remainder == 0) {
			msg = "Sao Multiplos";
		} else {
			msg = "Nao sao Multiplos";
		}

		System.out.println(msg);
	}
}
