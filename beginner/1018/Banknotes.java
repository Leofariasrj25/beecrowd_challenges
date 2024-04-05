// challenge link - https://judge.beecrowd.com/en/problems/view/1018

import java.io.IOException;
import java.util.Scanner;

public class Banknotes {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int value = reader.nextInt();
		int ogValue = value;
		
		int[] notes = {100, 50, 20, 10, 5, 2, 1};
		int[] notesUsed = new int[notes.length];
		int notes_index = 0;

		while (notes_index < notes.length) {
			if (value >= notes[notes_index]) {
				value -= notes[notes_index];
				notesUsed[notes_index] = notesUsed[notes_index] + 1;
			} else {
				notes_index++;
			}
		}
		
		System.out.println(ogValue);

		for (int i = 0; i < notes.length; i++) {
			System.out.println(notesUsed[i] + " nota(s) de R$ " + notes[i] + ",00");
		}
	}
}
