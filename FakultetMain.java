package nasledjivanjeZadaci;

public class FakultetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Profesor profa = new Profesor("Petar", "Petrovic", "59832496541", "Filologija");
		Profesor fesorpro = new Profesor("Dzon", "Smit", "4612196516", "SPanski jezik");
		
		Student brucos = new Student("Sinisa", "Mali", "65165965165", "00/00");
		Student maturant = new Student("Aleksandar", "Vulin", "635968465", "12/895");
		
		profa.stampaj();
		fesorpro.stampaj();
		System.out.println("/////////");
		brucos.Stampaj();
		maturant.Stampaj();
		
	}

}
//U glavnom programu kreirati 2 studenta i 2 profesora.