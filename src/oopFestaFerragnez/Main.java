package oopFestaFerragnez;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			String []invitatiFerragnez = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
					"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

					Party festaFerragnez = new Party(invitatiFerragnez);
			
			
			System.out.println("Come ti chiami?");
			String ospite = input.nextLine();
			
			festaFerragnez.accettaOspite(ospite);
			
		}
}
