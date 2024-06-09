public class Etairia {
	private String afm;
	private String onoma;
	private String diefthynsi;

	public Etairia(String afm, String onoma, String diefthynsi) {
		this.afm = afm;
		this.onoma = onoma;
		this.diefthynsi = diefthynsi;
	}

	public String getAfm() {
		return afm;
	}

	public void setAfm(String afm) {
		this.afm = afm;
	}

	public String getOnoma() {
		return onoma;
	}

	public void setOnoma(String onoma) {
		this.onoma = onoma;
	}

	public String getDiefthynsi() {
		return diefthynsi;
	}

	public void setDiefthynsi(String diefthynsi) {
		this.diefthynsi = diefthynsi;
	}

	public void printData(int i) {
		System.out.println("[" + i + "] Onoma: " + onoma + ", Diefthynsi: " + diefthynsi + ", AFM: " + afm);
	}
}
