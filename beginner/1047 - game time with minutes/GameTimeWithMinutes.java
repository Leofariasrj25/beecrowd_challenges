// challenge link - https://judge.beecrowd.com/en/problems/view/1047

import java.io.IOException;
import java.util.Scanner;

public class GameTimeWithMinutes {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int startHour = reader.nextInt();
		int startMinutes = reader.nextInt();
		int endHour = reader.nextInt();
		int endMinutes = reader.nextInt();
		reader.close();

		startMinutes = startHour * 60 + startMinutes;
		endMinutes = endHour * 60 + endMinutes;
		int totalMinutes = 0;

		if (startMinutes < endMinutes) {
			totalMinutes = endMinutes - startMinutes;
		} else {
			totalMinutes = (24 * 60) - startMinutes + endMinutes;
		}

		int totalHours = totalMinutes / 60;
		totalMinutes = totalMinutes % 60;
		System.out.println("O JOGO DUROU " + totalHours + " HORA(S) E " + totalMinutes + " MINUTO(S)");
	}
}
