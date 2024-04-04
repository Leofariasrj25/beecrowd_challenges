// challenge link - https://judge.beecrowd.com/en/problems/view/1009

import java.io.IOException;
import java.util.Scanner;

public class SalaryWithBonus {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		reader.nextLine();
		double salary = reader.nextDouble();
		double totalSales = reader.nextDouble();
		double finalSalary = salary + ((totalSales * 15) / 100.00);
		System.out.println("TOTAL = R$ " + String.format("%.2f", finalSalary));
		reader.close();
	}
}
