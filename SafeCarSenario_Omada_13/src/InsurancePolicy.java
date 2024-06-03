public class InsurancePolicy {
	private String kodikos_paketou;
	private String perigrafi;
	private String diarkeia;

	public InsurancePolicy(String kodikos_paketou, String perigrafi, String diarkeia) {
		this.kodikos_paketou = kodikos_paketou;
		this.perigrafi = perigrafi;
		this.diarkeia = diarkeia;
	}

	public void setKodikos_paketou(String kodikos_paketou) {
		this.kodikos_paketou = kodikos_paketou;
	}

	public void setPerigrafi(String perigrafi) {
		this.perigrafi = perigrafi;
	}

	public void setDiarkeia(String diarkeia) {
		this.diarkeia = diarkeia;
	}

	public String getKodikos_paketou() {
		return kodikos_paketou;
	}

	public String getPerigrafi() {
		return perigrafi;
	}

	public String getDiarkeia() {
		return diarkeia;
	}

}
