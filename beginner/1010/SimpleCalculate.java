import java.io.IOException;
import java.util.Scanner;

public class SimpleCalculate {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		double totalPrice = 0.0;
		double numOfItems = 2;

		for (int i = 0; i < numOfItems; i++) {
			String[] line = reader.nextLine().split(" ");
			int qtty = Integer.parseInt(line[1]);
			double price = Double.parseDouble(line[2]);
			totalPrice += qtty * price;
		}

		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", totalPrice));
		reader.close();
	}
}
