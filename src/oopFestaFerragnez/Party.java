/*Festa Ferragnez OOP:
State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di 
assicurarvi che accedano alla festa solo gli invitati presenti sulla lista. Lista invitati: 
Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio, Luis, 
Pardis Zarei, Martina Maccherone, Rachel Zeilic
OOP:
Creare la classe Party che possa ospitare un array di invitati nel costruttore.
Fornire un metodo “accettaOspite” che prenda come parametro un nome e verifichi se
è all’interno dell’array di invitati.
Creare una classe SicurezzaParty che chieda all’utente il nome e invochi le funzioni di 
Party per verificare se è accettato o meno.
BONUS:
Nella classe Party bisogna dare l’opportunità a Fedez di escludere Luis, quindi 
predisporre una funzione che possa sovrascrivere il nome di Luis con un invitato 
qualunque (uno nuovo) se e solo se c’è un valore booleano isLuisAntipatico = true 
(dovete trovare il modo di predisporlo nel posto giusto e valorizzarlo nel modo giusto).*/

package oopFestaFerragnez;

public class Party {
	String[] invitati;
	
	public Party(String[] invitati) {
		this.invitati = invitati;
	}
	
	public void accettaOspite(String nome) {
		System.out.println("Ti chiami " + nome + " eh... Fammi controllare se sei in lista...");
		boolean isInvitato = false;
		
		for (String invitato : invitati)
		{
			if (invitato.equals(nome)) {
				isInvitato = true;
				}
			}
		 if (isInvitato == true) {
			 System.out.println("Sei in lista. Entra pure.");
		}
		 else {
			 System.out.println("Mi dispiace, non posso farti entrare. Sono le direttive.");
		 }
			
	}
		
}