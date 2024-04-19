import java.io.IOException;
import java.util.Scanner;

public class SelectionTest1 {
	public static void main(String[] args) throws IOException {
		int a;
		int b;
		int c;
		int d;
		Scanner reader;

		reader = new Scanner(System.in);
		a = reader.nextInt();
		b = reader.nextInt();
		c = reader.nextInt();
		d = reader.nextInt();
		reader.close();

		if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 &&
				a % 2 == 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
	}
}
