// challenge link - https://judge.beecrowd.com/en/problems/view/1037

import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Interval {
	public static void main(String[] args) throws IOException {
		double value;
		Scanner reader;
		String interval = "";

		reader = new Scanner(System.in);
		value = reader.nextDouble();
		reader.close();

		if (value < 0 || value > 100) {
			System.out.println("Fora de intervalo");
			return;
		}

		if (value >= 0 && value <= 25) {
			interval = "[0,25]";
		} else if (value > 25 && value <= 50) {
			interval = "(25,50]";
		} else if (value > 50 && value <= 75) {
			interval = "(50,75]";
		} else {
			interval = "(75,100]";
		}

		System.out.println("Intervalo " + interval);
	}
}
