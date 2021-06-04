package grananja;

import java.util.Scanner;

public class Grananja4 {

	public static void main(String[] args) {

		/*
		 * Grananja4: Napisati program koji na osnovu unete godine i meseca ispisuje
		 * koliko taj mesec ima dana. (Vodite racuna o prestupnoj godini!)
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite mesec za koji se ispisuje broj dana: ");
		String mesec = s.nextLine();
		System.out.println("Unesite godinu: ");
		int godina = s.nextInt();

		if (godina > 0) {
			switch (mesec) {
			case "Februar":
				if ((godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0) {
					System.out.println(mesec + " " + godina + " ima 29 dana.");
				} else {
					System.out.println(mesec + " " + godina + " ima 28 dana.");
				}
				break;
			case "Januar":
			case "Mart":
			case "Maj":
			case "Jul":
			case "Avgust":
			case "Oktobar":
			case "Decembar":
				System.out.println(mesec + " " + godina + " ima 31 dan.");
				break;
			case "April":
			case "Jun":
			case "Septembar":
			case "Novembar":
				System.out.println(mesec + " " + godina + " ima 30 dana.");
				break;
			default:
				System.out.println("Nepostojeci unos!");
			}
		}
		else if(godina == 0) {
			System.out.println("U kalendaru ne postoji nulta godina, 1. godina n.e. sledi odmah nakon 1. godine pne.");
		}else {
			System.out.println("Uneli ste negativan broj za godinu... ");
		}
	}
}
