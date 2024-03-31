// challenge link - https://judge.beecrowd.com/en/problems/view/1005

import java.io.IOException;
import java.util.Scanner;

public class Average1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double weight1 = 3.5;
		double weight2 = 7.5;
		double grade1 = reader.nextDouble() * weight1;
		double grade2 = reader.nextDouble() * weight2;
		double average = (grade1 + grade2) / (weight1 + weight2);
		System.out.println("MEDIA = " + String.format("%.5f", average));
		reader.close();
	}
}
