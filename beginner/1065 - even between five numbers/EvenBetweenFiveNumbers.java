
// challenge link - https://judge.beecrowd.com/en/problems/view/1065
import java.io.IOException;
import java.util.Scanner;

public class EvenBetweenFiveNumbers {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int inputSize = 5;
		int evenQtty = 0;

		while (inputSize > 0) {
			int num = reader.nextInt();

			if (num % 2 == 0) {
				evenQtty++;
			}

			inputSize--;
		}

		reader.close();
		System.out.println(evenQtty + " valores pares");
	}
}
