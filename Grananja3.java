package grananja;

import java.util.Scanner;

public class Grananja3 {

	public static void main(String[] args) {

		/*Grananja3: Napisati program koji na osnovu unetog naziva meseca ispisuje koliko ima meseci u 
		 * godini koji pocinju na to slovo(na taj glas) - za resavanje ovog zadatka koristiti switch*/
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite naziv meseca sa velikim pocetnim slovom: ");
		String mesec = s.nextLine();
		
		switch(mesec) {
		case "Januar":
		case "Jun":
		case "Jul":
			System.out.println("Tri meseca u godini pocinju pocetnim slovom ovog meseca!");
			break;
		case "Mart":
		case "Maj":
		case "April":
		case "Avgust":
			System.out.println("Dva meseca u godini pocinju pocetnim slovom ovog meseca!");
			break;
		case "Februar":
		case "Septembar":
		case "Oktobar":
		case "Novembar":
		case "Decembar":
			System.out.println("Jedan mesec u godini pocinje pocetnim slovom ovog meseca!");
			break;
		default:
			System.out.println("Nepostojeci unos!");
		}
	}
}
