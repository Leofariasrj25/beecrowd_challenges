// challenge link - https://judge.beecrowd.com/en/problems/view/1051

import java.io.IOException;
import java.util.Scanner;

public class Taxes {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		float salary = reader.nextFloat();
		reader.close();

		if (salary >= 0.0 && salary <= 2000.00) {
			System.out.println("Isento");
			return;
		}

		float taxes = calculateSalaryTax(salary);
		System.out.println("R$ " + String.format("%.2f", taxes));
	}

	public static float calculateSalaryTax(float salary) {
		float taxes = 0.0f;
		float taxable = 0.0f;

		if (salary > 4500.00f) {
			taxable = salary - 4500.0f;
			taxes += (taxable * 28) / 100.0f;
			salary -= taxable;
		}

		if (salary > 3000.00f && salary <= 4500f) {
			taxable = salary - 3000.00f;
			taxes += (taxable * 18) / 100.0f;
			salary -= taxable;
		}

		if (salary > 2000.00f && salary <= 3000.00f) {
			taxable = salary - 2000.00f;
			taxes += (taxable * 8) / 100.0f;
		}

		return taxes;
	}
}
