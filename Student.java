package nasledjivanjeZadaci;

public class Student extends Osoba {
	
	private String brojIndeksa;

	public Student(String ime, String prezime, String jMBG, String brojIndeksa) {
		super(ime, prezime, jMBG);
		this.brojIndeksa = brojIndeksa;
	}
	
	public void Stampaj() {
		// Ovde moze i super.stampaj(); umesto gettera
		System.out.println(super.getIme() + " " + super.getPrezime() + ", " + super.getJMBG() + ", borj indeksa: " + brojIndeksa);
	}
	
}
//Kreirati klasu Student koja nasledjuje klasu Osoba, 
//koja od dodatnih atributa ima:
//•	broj indeksa
//•	konstuktor sa parametrima
//•	metodu stampaj koja stampa podatke u formatu:
//ime prezime, jmbg, broj indeksa
