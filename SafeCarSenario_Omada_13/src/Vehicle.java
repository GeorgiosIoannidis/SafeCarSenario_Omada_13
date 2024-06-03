public class Vehicle {

	private String marka;
	private String modelo;
	private String year;
	private String pinakida;
	private String arithmos_plaisiou;

	public Vehicle(String marka, String modelo, String pinakida, String year, String arithmos_plaisiou) {
		this.marka = marka;
		this.modelo = modelo;
		this.year = year;
		this.pinakida = pinakida;
		this.arithmos_plaisiou = arithmos_plaisiou;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setPinakida(String pinakida) {
		this.pinakida = pinakida;
	}

	public void setArithmos_plaisiou(String arithmos_plaisiou) {
		this.arithmos_plaisiou = arithmos_plaisiou;
	}

	public String getMarka() {
		return marka;
	}

	public String getModelo() {
		return modelo;
	}

	public String getYear() {
		return year;
	}

	public String getPinakida() {
		return pinakida;
	}

	public String getArithmos_plaisiou() {
		return arithmos_plaisiou;
	}

	public String toString() {
		return marka + " " + modelo + " " + pinakida + " " + year + " " + arithmos_plaisiou;
	}

}
