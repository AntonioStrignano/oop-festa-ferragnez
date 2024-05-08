package oopFestaFerragnez;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			String []invitatiFerragnez = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
					"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

					Party festaFerragnez = new Party(invitatiFerragnez);
			
			boolean isLuisAntipatico = false;
			System.out.println("Fedez ha gia' litigato con Luis? ");
				String litigio = input.nextLine();
				if (litigio.equals("si")) {
					isLuisAntipatico = true;
				}			
			
			festaFerragnez.accettaOspite(isLuisAntipatico);
			
		}
}
