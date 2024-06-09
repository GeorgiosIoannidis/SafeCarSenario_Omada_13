public class Paketo {
	private int diarkeia;
	private int kwdikos;
	private String typos;

	public Paketo(int diarkeia, int kwdikos, String typos) {
		this.diarkeia = diarkeia;
		this.kwdikos = kwdikos;
		this.typos = typos;
	}

	public int getDiarkeia() {
		return diarkeia;
	}

	public void setDiarkeia(int diarkeia) {
		this.diarkeia = diarkeia;
	}

	public int getKwdikos() {
		return kwdikos;
	}

	public void setKwdikos(int kwdikos) {
		this.kwdikos = kwdikos;
	}

	public String getTypos() {
		return typos;
	}

	public void setTypos(String typos) {
		this.typos = typos;
	}

	public void printData(int i) {
		System.out.println("[" + i + "] Typos: " + typos + ", Diarkeia: " + diarkeia + ", Kwdikos: " + kwdikos);
	}
}
