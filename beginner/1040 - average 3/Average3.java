import java.io.IOException;
import java.util.Scanner;

public class Average3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		float score1 = reader.nextFloat();
		float score2 = reader.nextFloat();
		float score3 = reader.nextFloat();
		float score4 = reader.nextFloat();

		float average = ((score1 * 2) + (score2 * 3) + (score3 * 4) + (score4 * 1)) / 10;

		System.out.println("Media: " + String.format("%.1f", average));
		String passMsg = "Aluno aprovado.";
		String failMsg = "Aluno reprovado.";

		if (average >= 7.0) {
			System.out.println(passMsg);
		} else if (average < 5.0) {
			System.out.println(failMsg);
		} else if (average >= 5.0 && average <= 6.9) {
			System.out.println("Aluno em exame.");
			float examScore = reader.nextFloat();
			System.out.println("Nota do exame: " + String.format("%.1f", examScore));
			average = (average + examScore) / 2;

			if (average >= 5.0) {
				System.out.println(passMsg);
			} else {
				System.out.println(failMsg);
			}

			System.out.println("Media final: " + String.format("%.1f", average));
		}

		reader.close();
	}
}
