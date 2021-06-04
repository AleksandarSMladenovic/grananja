package grananja;

import java.util.Scanner;

public class Grananja2 {

	public static void main(String[] args) {

		/*
		 * Grananja2: Prvi domaci zadatak od 15.4.2021. uraditi ponovo, koristeci
		 * grananja kako bismo se ogradili od nemogucih izracunavanja povrsina (kakvi
		 * celi brojevi moraju da budu visina, sirina i duzina?)
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite dimenzije prostorije za koju se racuna povrsina." + "\nUnesite duzinu prostorije:");
		double duzina = s.nextDouble();

		System.out.println("Unesite sirinu prostorije:");
		double sirina = s.nextDouble();

		System.out.println("Unesite visinu prostorije: ");
		double visina = s.nextDouble();

		if(duzina > 0 && sirina > 0 && visina > 0){
			double povrsina = 2 * duzina * visina + 2 * sirina * visina + sirina * duzina;
			System.out.println("Povrsina okrecene prostorije je: " + povrsina + "m2");
		}else {
			System.out.println("Neispravan unos!!!");
		}

	}

}
