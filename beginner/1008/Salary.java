// challenge link - https://judge.beecrowd.com/en/problems/view/1008

import java.io.IOException;
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int workerID = reader.nextInt();
		int hoursWorked = reader.nextInt();
		double hourlyRate = reader.nextDouble();
		System.out.println("NUMBER = " + workerID);
		System.out.println("SALARY = U$ " + String.format("%.2f", hoursWorked * hourlyRate));
		reader.close();
	}
}
