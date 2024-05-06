//challenge link - https://judge.beecrowd.com/en/problems/view/1095

import java.io.IOException;

public class SequenceIJ1 {
	public static void main(String[] args) throws IOException {
		for (int i = 1, j = 60; j >= 0; i += 3, j -= 5) {
			System.out.println(String.format("I=%d J=%d", i, j));
		}
	}
}
