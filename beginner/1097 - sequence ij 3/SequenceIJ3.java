// challenge link - https://judge.beecrowd.com/en/problems/view/1097

import java.util.Scanner;
import java.io.IOException;

public class SequenceIJ3 {
	public static void main(String[] args) throws IOException {
		for (int i = 1; i <= 9; i += 2) {
			int j = i + 6;
			int limit = j - 3;

			for (; j > limit; j--) {
				System.out.println("I=" + i + " " + "J=" + j);
			}
		}
	}
}
