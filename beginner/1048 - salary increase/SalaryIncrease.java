// challenge link - https://judge.beecrowd.com/en/problems/view/1048

import java.io.IOException;
import java.util.Scanner;

public class SalaryIncrease {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		double currentSalary = reader.nextDouble();
		reader.close();

		int readjustmentRate = getRateBasedOn(currentSalary);
		double readjustment = (currentSalary * readjustmentRate) / 100.0;
		double newSalary = currentSalary + readjustment;

		System.out.println("Novo salario: " + String.format("%.2f", newSalary));
		System.out.println("Reajuste ganho: " + String.format("%.2f", readjustment));
		System.out.println("Em percentual: " + readjustmentRate + " %");
	}

	public static int getRateBasedOn(double salary) {
		int rate = 0;

		if (salary >= 0.0 && salary <= 400.0) {
			rate = 15;
		} else if (salary >= 400.01 && salary <= 800.0) {
			rate = 12;
		} else if (salary >= 800.01 && salary <= 1200.0) {
			rate = 10;
		} else if (salary >= 1200.01 && salary <= 2000.0) {
			rate = 7;
		} else {
			rate = 4;
		}

		return rate;
	}
}
