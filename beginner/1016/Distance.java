import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Distance {

	public static void main(String[] args) throws IOException {
		int xSpeed = 60; // km/h
		int ySpeed = 90; // km/h
		int speedDiff = 60 / Math.abs(xSpeed - ySpeed);
		Scanner reader = new Scanner(System.in);
		int distance = reader.nextInt();
		reader.close();
		int timeSpent = speedDiff * distance;
		System.out.println(timeSpent + " minutos");
	}
}
