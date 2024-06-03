public class InsuranceContract {
	private Customer customer;
	private Vehicle vehicle;
	private InsurancePolicy policy;
	private int price;

	public InsuranceContract(Customer customer, Vehicle vehicle, InsurancePolicy policy, int price) {
		this.customer = customer;
		this.vehicle = vehicle;
		this.policy = policy;
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public InsurancePolicy getPolicy() {
		return policy;
	}

	public int getPrice() {
		return price;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void setPolicy(InsurancePolicy policy) {
		this.policy = policy;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
