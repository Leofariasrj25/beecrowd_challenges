import java.util.Scanner;
import java.io.IOException;

public class FixedPassword {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int password = 2002;

		while (true) {
			int input = reader.nextInt();

			if (input == password) {
				System.out.println("Acesso Permitido");
				break;
			}

			System.out.println("Senha Invalida");
		}

		reader.close();
	}
}
