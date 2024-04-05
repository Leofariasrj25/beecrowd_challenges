// challenge link - https://judge.beecrowd.com/en/problems/view/1019

import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int totalSeconds = reader.nextInt();
		reader.close();

		int hours = totalSeconds / 3600;
		totalSeconds = totalSeconds % 3600;
		int minutes = totalSeconds / 60;
		int seconds = totalSeconds % 60;

		System.out.println(hours + ":" + minutes + ":" + seconds);
	}
}
