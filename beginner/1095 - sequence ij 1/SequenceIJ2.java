// challenge link - https://judge.beecrowd.com/en/problems/view/1096

import java.io.IOException;

public class SequenceIJ2 {
	public static void main(String[] args) throws IOException {
		for (int i = 1; i < 10; i += 2) {
			for (int j = 7; j > 4; j--) {
				System.out.println(String.format("I=%d J=%d", i, j));
			}
		}
	}
}
