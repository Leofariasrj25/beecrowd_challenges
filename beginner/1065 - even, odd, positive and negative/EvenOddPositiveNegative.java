// challenge link - 

import java.io.IOException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class EvenOddPositiveNegative {
	public static void main(String[] args) throws IOException {
		int values[] = getValues(5);
		Map<String, Integer> results = parse(values);

		System.out.println(results.get("even") + " valor(es) pares");
		System.out.println(results.get("odd") + " valor(es) impar(es)");
		System.out.println(results.get("positive") + " valor(es) positivo(s)");
		System.out.println(results.get("negative") + " valor(es) negativo(s)");
	}

	public static int[] getValues(int inputSize) {
		Scanner reader = new Scanner(System.in);
		int vals[] = new int[inputSize];

		for (int i = 0; i < inputSize; i++) {
			vals[i] = reader.nextInt();
		}

		reader.close();
		return vals;
	}

	public static Map<String, Integer> parse(int[] values) {
		int odd = 0;
		int even = 0;
		int positive = 0;
		int negative = 0;

		for (int num : values) {

			if (num < 0) {
				negative++;
			} else if (num != 0) {
				positive++;
			}

			if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		Map<String, Integer> results = new HashMap<>();
		results.put("even", even);
		results.put("odd", odd);
		results.put("positive", positive);
		results.put("negative", negative);

		return results;
	}
}
