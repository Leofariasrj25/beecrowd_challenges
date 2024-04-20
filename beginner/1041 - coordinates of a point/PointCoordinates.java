import java.io.IOException;
import java.util.Scanner;

public class PointCoordinates {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		float x = reader.nextFloat();
		float y = reader.nextFloat();
		reader.close();
		String msg;

		if (x == y && x == 0.0) {
			msg = "Origem";
		} else if (x != 0.0 && y == 0.0) {
			msg = "Eixo X";
		} else if (x == 0.0 && y != 0.0) {
			msg = "Eixo Y";
		} else if (x > 0.0 && y > 0.0) {
			msg = "Q1";
		} else if (x < 0.0 && y > 0.0) {
			msg = "Q2";
		} else if (x < 0.0 && y < 0.0) {
			msg = "Q3";
		} else {
			msg = "Q4";
		}

		System.out.println(msg);
	}
}
