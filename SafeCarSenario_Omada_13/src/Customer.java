public class Customer {

	private String name;
	private String lastName;
	private String phone;
	private String email;
	private String arithmos_taftotitas;

	public Customer(String name, String lastName, String phone, String email, String arithmos_taftotitas) {
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.arithmos_taftotitas = arithmos_taftotitas;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setArithmos_taftotitas(String arithmos_taftotitas) {
		this.arithmos_taftotitas = arithmos_taftotitas;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getArithmos_taftotitas() {
		return arithmos_taftotitas;
	}

}
