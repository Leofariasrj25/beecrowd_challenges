// challenge link - https://judge.beecrowd.com/en/problems/view/1049

import java.io.IOException;
import java.util.Scanner;

public class Animal {
	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		String trait1 = reader.next();
		String trait2 = reader.next();
		String trait3 = reader.next();
		reader.close();
		String animal = "";

		if (isVertebrate(trait1) && isBird(trait2)) {
			if (isCarnivorous(trait3)) {
				animal = "aguia";
			} else {
				animal = "pomba";
			}
		}

		if (isVertebrate(trait1) && isMammal(trait2)) {
			if (isOmnivore(trait3)) {
				animal = "homem";
			} else {
				animal = "vaca";
			}
		}

		if (!isVertebrate(trait1) && isInsect(trait2)) {
			if (isHematophagous(trait3)) {
				animal = "pulga";
			} else {
				animal = "herbivoro";
			}
		}

		if (!isVertebrate(trait1) && isAnnelid(trait2)) {
			if (isHematophagous(trait3)) {
				animal = "sanguessuga";
			} else {
				animal = "minhoca";
			}
		}

		System.out.println(animal);
	}

	public static boolean isVertebrate(String animal) {
		return animal.equals("vertebrado");
	}

	public static boolean isBird(String animal) {
		return animal.equals("ave");
	}

	public static boolean isMammal(String animal) {
		return animal.equals("mamifero");
	}

	public static boolean isInsect(String animal) {
		return animal.equals("inseto");
	}

	public static boolean isAnnelid(String animal) {
		return animal.equals("anelideo");
	}

	public static boolean isCarnivorous(String animal) {
		return animal.equals("carnivoro");
	}

	public static boolean isOmnivore(String animal) {
		return animal.equals("onivoro");
	}

	public static boolean isHematophagous(String animal) {
		return animal.equals("hematofago");
	}

}
