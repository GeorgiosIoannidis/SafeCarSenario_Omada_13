public class Pelaths {
	private String onoma;
	private String epitheto;
	private String arithmosTaytothtas;
	private String kinhto;

	public Pelaths(String onoma, String epitheto, String arithosTaytothtas, String kinhto) {
		this.onoma = onoma;
		this.epitheto = epitheto;
		this.arithmosTaytothtas = arithosTaytothtas;
		this.kinhto = kinhto;
	}

	public void setOnoma(String onoma) {
		this.onoma = onoma;
	}

	public void setEpitheto(String epitheto) {
		this.epitheto = epitheto;
	}

	public void setArithmosTaytothtas(String arithmosTaytothtas) {
		this.arithmosTaytothtas = arithmosTaytothtas;
	}

	public void setKinhto(String kinhto) {
		this.kinhto = kinhto;
	}

	public String getOnoma() {
		return onoma;
	}

	public String getEpitheto() {
		return epitheto;
	}

	public String getArithmosTaytothtas() {
		return arithmosTaytothtas;
	}

	public String getKinhto() {
		return kinhto;
	}

	public void printData(int i) {
		System.out.println("[" + i + "] Onoma: " + onoma + ", Epitheto: " + epitheto + ", Kinhto: " + kinhto
				+ ", Arithmos Taytothas: " + arithmosTaytothtas);
	}
}
