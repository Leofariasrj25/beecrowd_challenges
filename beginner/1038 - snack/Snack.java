// challenge link - https://judge.beecrowd.com/en/problems/view/1038 

import java.io.IOException;
import java.util.Scanner;

public class Snack {
	public static void main(String[] args) throws IOException {
		int productId;
		int quantity;
		Scanner reader;

		reader = new Scanner(System.in);
		productId = reader.nextInt();
		quantity = reader.nextInt();
		reader.close();
		double price = 0.0;

		switch (productId) {
			case 1:
				price = 4.00;
				break;

			case 2:
				price = 4.50;
				break;

			case 3:
				price = 5.00;
				break;

			case 4:
				price = 2.00;
				break;

			case 5:
				price = 1.50;
				break;
		}

		double finalValue = price * quantity;
		System.out.println("Total: R$ " + String.format("%.2f", finalValue));
	}
}
