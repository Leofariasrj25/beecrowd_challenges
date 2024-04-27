import java.util.Scanner;
import java.io.IOException;

public class EvenOrOdd {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int testCases = reader.nextInt();

		while (testCases != 0) {
			int num = reader.nextInt();
			String msg = "";

			if (num == 0) {
				System.out.println("NULL");
				testCases--;
				continue;
			}

			if (num % 2 == 0) {
				msg = "EVEN";
			} else {
				msg = "ODD";
			}

			if (num > 0) {
				msg += " POSITIVE";
			} else {
				msg += " NEGATIVE";
			}

			System.out.println(msg);
			testCases--;
		}

		reader.close();
	}
}
