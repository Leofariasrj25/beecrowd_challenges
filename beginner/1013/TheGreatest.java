import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class TheGreatest {

	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int a, b, c, greatest;
		a = reader.nextInt();
		b = reader.nextInt();
		c = reader.nextInt();
		reader.close();
		greatest = getGreatest(a, b);
		greatest = getGreatest(greatest, c);
		System.out.println(greatest + " eh o maior");
	}

	public static int getGreatest(int a, int b) {
		return (a + b + Math.abs(a - b)) / 2;
	}
}
