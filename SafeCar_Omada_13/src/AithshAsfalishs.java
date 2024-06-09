public class AithshAsfalishs {
	private Pelaths stoixeiaPelath;
	private Paketo paketo;
	private Oxhma oxhma;

	public AithshAsfalishs(Pelaths stoixeiaPelath, Paketo paketo, Oxhma oxhma) {
		this.stoixeiaPelath = stoixeiaPelath; 
		this.paketo = paketo;
		this.oxhma = oxhma;
	}

	public Pelaths getStoixeiaPelath() {
		return stoixeiaPelath;
	}

	public void setStoixeiaPelath(Pelaths stoixeiaPelath) {
		this.stoixeiaPelath = stoixeiaPelath;
	}

	public Paketo getPaketo() {
		return paketo;
	}

	public void setPaketo(Paketo paketo) {
		this.paketo = paketo;
	}

	public Oxhma getOxhma() {
		return oxhma;
	}

	public void setOxhma(Oxhma oxhma) {
		this.oxhma = oxhma;
	}
	

	public void ypobolh(Ypallhlos currentYpalhlos, Statistika statistika) {
		//Ενημερωση των στατιστικων και των ενεργειων του υπαλληλου που την υπεβαλλε
		int energies = currentYpalhlos.getEnergies();
		int asfalhseis = statistika.getAsfalhseis();
		double eksoda = statistika.getEksoda();

		currentYpalhlos.setEnergies(energies + 1);
		statistika.setAsfalhseis(asfalhseis + 1);
		//καθε νεα αιτηση κοστιζει 10 ευρο λογο παραβολων κλπ
		statistika.setEksoda(eksoda + 10);
	}

	public int ypologismosKostous(Statistika statistika) {
		//υπολογισμος κοστος αναλογα με την διαρκεια του πακετου
		int kwstos = 0;
		double esoda = statistika.getEsoda();
		if (paketo.getDiarkeia() < 2) {
			kwstos = 20;
		} else if (paketo.getDiarkeia() < 5) {
			kwstos = 40;
		} else if (paketo.getDiarkeia() < 7) {
			kwstos = 60;
		} else {
			kwstos = 100;
		}
		//ενημερωσε τα εσοδα
		statistika.setEsoda(esoda + kwstos);
		return kwstos;

	}

	public void printData() {
		System.out.println("Pelaths: " + stoixeiaPelath.getOnoma() + " " + stoixeiaPelath.getEpitheto() + ", Oxhma: "
				+ oxhma.getMarka() + " " + oxhma.getMontelo() + ", Paketo: " + paketo.getTypos() + " "
				+ paketo.getDiarkeia());
	}
}
