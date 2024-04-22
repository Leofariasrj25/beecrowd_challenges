// challenge link - https://judge.beecrowd.com/en/problems/view/1052

import java.util.Scanner;
import java.io.IOException;

public class Month {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int monthNumber = reader.nextInt();
		reader.close();
		System.out.println(getMonthName(monthNumber));
	}

	public static String getMonthName(int monthNumber) {
		String months[] = { "January", "February", "March", "April",
				"May", "June", "July", "August", "September",
				"October", "November", "December" };

		if (monthNumber >= 1 && monthNumber <= 12) {
			return months[monthNumber - 1];
		} else {
			return "Invalid month number, it must be a number between 1 and 12";
		}
	}
}
