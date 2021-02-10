package nasledjivanjeZadaci;

public class Osoba {
	private String ime;
	private String prezime;
	private String JMBG;
	
	
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getJMBG() {
		return JMBG;
	}

	public void setJMBG(String jMBG) {
		JMBG = jMBG;
	}

	public Osoba(String ime, String prezime, String jMBG) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		JMBG = jMBG;
	}
	
	public void stampaj() {
		System.out.println(ime + " " + prezime + ", " + JMBG);
	}
	
	
}
//Kreirati klasu Osoba koja od atributa ima:
//•	 ime i prezime
//•	 jmbg
//•	konstuktor sa parametrima
//•	metodu stampaj koja stampa podatke u formatu
//		ime prezime, jmbg
