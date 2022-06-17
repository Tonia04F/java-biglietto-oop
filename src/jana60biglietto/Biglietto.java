package jana60biglietto;

public class Biglietto {
/*Creare una classe Biglietto con due attributi:
 *  chilometri ed 
 *  età del passeggero.
 *  
Utilizzare i modificatori dei livelli di accesso per proteggere il funzionamento interno della classe ed esporre solo un’interfaccia fatta di metodi public, come abbiamo visto in classe e nelle slide.
La classe deve esporre un metodo che calcola il prezzo del biglietto secondo la logica:
il prezzo del biglietto è definito in base ai km (0.21 € al km)
va applicato uno sconto del 20% per i minorenni
va applicato uno sconto del 40% per gli over 65*/
	
	//ATTRIBUTI
	private int km;
	private int etaPasseggero;
	
	private double prezzoBiglietto;
	
	
	//COSTRUTTORE
	public Biglietto(int km, int etaPasseggero) {
		super();
		this.km = km;
		this.etaPasseggero = etaPasseggero;
	}


	//GETTER SETTER
	
	public int getKm() {
		return km;
	}


	public void setKm(int km) {
		this.km = km;
	}


	public int getEtaPasseggero() {
		return etaPasseggero;
	}


	public void setEtaPasseggero(int etaPasseggero) {
		this.etaPasseggero = etaPasseggero;
	}
	
	/*il prezzo del biglietto è definito in base ai km (0.21 € al km)
	 *va applicato uno sconto del 20% per i minorenni
	 *va applicato uno sconto del 40% per gli over 65*/
	
	//creo metodo per calcolare prezzo del biglietto
	public double calcolaPrezzo() {
		
		prezzoBiglietto = km * 0.21;
		
		if(etaPasseggero>65) {
			prezzoBiglietto= (km*0.21) - (prezzoBiglietto*40%100);
			System.out.println("Il passeggero è over 65 quindi viene applicato il 40% di sconto: " + prezzoBiglietto);
		}
		
		else if(etaPasseggero <18) {
			prezzoBiglietto = (km*0.21) - (prezzoBiglietto*20%100);
			System.out.println("Il passeggero è minorenne quindi viene applicato il 20% di sconto: " + prezzoBiglietto);
		}
		else{
			prezzoBiglietto = (km*0.21) ;
			System.out.println("Il prezzo del biglietto è: " + prezzoBiglietto);
		}
		return prezzoBiglietto;
		
	}
}
