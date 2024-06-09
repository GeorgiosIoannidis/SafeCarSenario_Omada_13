public class Oxhma {
	private String marka;
	private String montelo;
	private String pinakida;

	public Oxhma(String marka, String montelo, String pinakida) {
		this.marka = marka;
		this.montelo = montelo;
		this.pinakida = pinakida;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getMontelo() {
		return montelo;
	}

	public void setMontelo(String montelo) {
		this.montelo = montelo;
	}

	public String getPinakida() {
		return pinakida;
	}

	public void setPinakida(String pinakida) {
		this.pinakida = pinakida;
	}

	public void printData(int i) {
		System.out.println("[" + i + "] Marka: " + marka + ", Montelo: " + montelo + ", Pinakida: " + pinakida);
	}

}
