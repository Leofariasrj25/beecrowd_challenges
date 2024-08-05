import java.util.Scanner;
import java.io.IOException;

public class Quadrant {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int x, y;
		String quadrant = "";

		while (true) {
			x = reader.nextInt();
			y = reader.nextInt();

			if (x == 0 || y == 0) {
				break;
			}

			if (x > 0) {
				quadrant = y > 0 ? "primeiro" : "quarto";
			} else {
				quadrant = y > 0 ? "segundo" : "terceiro";
			}

			System.out.println(quadrant);
		}

		reader.close();
	}
}
