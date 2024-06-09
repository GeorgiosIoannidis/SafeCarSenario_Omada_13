import java.util.ArrayList;

public class Statistika {
	private double esoda;
	private double eksoda;
	private int asfalhseis;

	public Statistika(double esoda, double eksoda, int asfalhseis) {
		this.esoda = esoda;
		this.eksoda = eksoda;
		this.asfalhseis = asfalhseis;
	}

	public double getEsoda() {
		return esoda;
	}

	public void setEsoda(double esoda) {
		this.esoda = esoda;
	}

	public double getEksoda() {
		return eksoda;
	}

	public void setEksoda(double eksoda) {
		this.eksoda = eksoda;
	}

	public int getAsfalhseis() {
		return asfalhseis;
	}

	public void setAsfalhseis(int asfalhseis) {
		this.asfalhseis = asfalhseis;
	}

	public void emfanhseYpallhloMhna(ArrayList<Ypallhlos> yp) {
		//υπολογισμου του υπαλληλου του μηνα αναλογα με το ποσες ασφαλησεις εκανε
		int max = 0;
		int index = 0;
		for (int i = 0; i < yp.size(); i++) {
			if (yp.get(i).getEnergies() > max) {
				max = yp.get(i).getEnergies();
				index = i;
			}
		}

		System.out.println("Ypallhlos toy Mhna is: " + yp.get(index).getOnoma());
	}

	public void emfanhseEsoda() {
		System.out.println("Ta esoda einai: " + esoda + " euro");
	}

	public void emfanhseEksoda() {
		System.out.println("Ta eksoda einai: " + eksoda + " euro");
	}

	public void emfanhseAsfalhseis() {
		System.out.println("Synolika ginan " + asfalhseis + " asfalhseis");
	}

	public void printData() {
		System.out.println("Esoda: " + esoda + ", Eksoda: " + esoda + ", Asfalhseis: " + asfalhseis);
	}
}
