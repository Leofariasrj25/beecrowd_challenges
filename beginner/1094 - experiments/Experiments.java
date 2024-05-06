// challenge link - https://judge.beecrowd.com/en/problems/view/1094

import java.util.Scanner;
import java.io.IOException;

public class Experiments {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int rabbits = 0;
		int rats = 0;
		int frogs = 0;
		int totalAnimals = 0;
		int testCases = reader.nextInt();

		while (testCases-- > 0) {
			int animalQtty = reader.nextInt();
			totalAnimals += animalQtty;
			String animalType = reader.next();

			switch (animalType) {
				case "C":
					rabbits += animalQtty;
					break;
				case "R":
					rats += animalQtty;
					break;
				case "S":
					frogs += animalQtty;
					break;
			}
		}

		reader.close();
		System.out.println(String.format("Total: %d cobaias", totalAnimals));
		System.out.println(String.format("Total de coelhos: %d", rabbits));
		System.out.println(String.format("Total de ratos: %d", rats));
		System.out.println(String.format("Total de sapos: %d", frogs));

		double percentage = ((double) rabbits / totalAnimals) * 100.00;
		System.out.println(String.format("Percentual de coelhos: %.2f %%", percentage));

		percentage = ((double) rats / totalAnimals) * 100.00;
		System.out.println(String.format("Percentual de ratos: %.2f %%", percentage));

		percentage = ((double) frogs / totalAnimals) * 100.00;
		System.out.println(String.format("Percentual de sapos: %.2f %%", percentage));
	}
}
