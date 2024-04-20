import java.io.IOException;
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		float a = reader.nextFloat();
		float b = reader.nextFloat();
		float c = reader.nextFloat();
		reader.close();

		if (isValidTriangle(a, b, c)) {
			float perimeter = a + b + c;
			System.out.println("Perimetro = " + String.format("%.1f", perimeter));
			return;
		}

		float trapeziumArea = ((a + b) / 2) * c;
		System.out.println("Area = " + String.format("%.1f", trapeziumArea));
	}

	public static boolean isValidTriangle(float a, float b, float c) {
		return (a + b) > c && (a + c) > b && (b + c) > a;
	}
}
