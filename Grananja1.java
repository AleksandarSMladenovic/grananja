package grananja;

import java.util.Scanner;

public class Grananja1 {

	public static void main(String[] args) {
		/*
		 * Grananja1: Napisati program koji proverava da li je uneti broj paran. Ukoliko
		 * jeste, program treba da ispise poruku: Broj je paran! Ukoliko nije, program
		 * treba da ispise poruku: Broj je neparan!
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite ceo broj: ");
		int broj = s.nextInt();
		
		if(broj % 2 == 0) {
			System.out.println("Uneti broj je paran!");
		}
		else {
			System.out.println("Uneti broj je neparan");
		}
	}
}
