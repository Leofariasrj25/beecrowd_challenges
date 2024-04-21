import java.io.IOException;
import java.util.Scanner;

public class GameTime {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int start = reader.nextInt();
		int end = reader.nextInt();
		reader.close();

		int duration = 0;

		if (start < end) {
			duration = end - start;
		} else {
			duration = 24 - start + end;
		}

		System.out.println("O JOGO DUROU " + duration + " HORA(S)");
	}
}
