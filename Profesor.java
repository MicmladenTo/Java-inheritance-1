package nasledjivanjeZadaci;

public class Profesor extends Osoba {
	
	private String nazivPredmeta;

	public Profesor(String ime, String prezime, String jMBG, String nazivPredmeta) {
		super(ime, prezime, jMBG);
		this.nazivPredmeta = nazivPredmeta;
	}
	
	public void stampaj() {
		// Ovde moze i super.stampaj(); umesto gettera
		System.out.println(super.getIme() + " " + super.getPrezime() + ", " + super.getJMBG() + ", " + nazivPredmeta);
	}
}
//Kreirati klasu Profesor koja nasledjuje klasu Osoba, 
//koja od dodatnih atributa ima:
//•	naziv predmeta koji predaje
//•	konstuktor sa parametrima
//•	metodu stampaj koja stampa podatke u formatu:
//ime prezime, jmbg, predmet
//
//U glavnom programu kreirati 2 studenta i 2 profesora.
