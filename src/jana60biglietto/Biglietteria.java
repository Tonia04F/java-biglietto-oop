package jana60biglietto;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		/*Aggiungere una classe Biglietteria, eseguibile con metodo main, in cui si chiede all’utente 
		 * di inserire il numero di km e l’età del passeggero e 
		 * stampa il prezzo del biglietto calcolato.*/

		Scanner sc = new Scanner(System.in);
		int km, etaPasseggero;
		
			System.out.println("Benvenuto, dove desidera andare?");
			String destinazione = sc.nextLine();
	do {
		
			System.out.println("quanti anni hai?: ");
			etaPasseggero=Integer.parseInt(sc.nextLine());
			
			if(etaPasseggero<18) {
				System.out.println("Sei minirenne per viaggiare devi essere accompagnato da un'adulto");
			}
			
	}while(etaPasseggero<=18);
	
	
	do {
		
		System.out.println("Quanti km devi percorrere: ");
		km=sc.nextInt();
		
		if(km<20) {
			System.out.println("Il viaggio breve supera i 20 km, non ci sono biglietti disponibili ");
		}
		
}while(km<20);
	
	Biglietto ticket = new Biglietto(km, etaPasseggero);
	System.out.println(ticket.calcolaPrezzo());
		
		
		
	

	}
}
