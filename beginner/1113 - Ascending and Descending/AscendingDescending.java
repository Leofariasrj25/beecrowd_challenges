// challenge link - https://judge.beecrowd.com/en/problems/view/1113

import java.util.Scanner;
import java.io.IOException;

public class AscendingDescending {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);

		while (true) {
			int a = reader.nextInt();
			int b = reader.nextInt();

			if (a == b) {
				break;
			}

			String msg = "Crescente";

			if (a > b) {
				msg = "Decrescente";
			}

			System.out.println(msg);
		}

		reader.close();
	}
}
