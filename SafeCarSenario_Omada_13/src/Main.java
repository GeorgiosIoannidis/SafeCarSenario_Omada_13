import java.util.ArrayList;

class Main {
	public static void main(String[] args) {

		ArrayList<Customer> customers = new ArrayList<Customer>();
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

		// customers
		Customer customer1 = new Customer("Maria", "Papadopoulou", "2310264368", "maria.papadopoulou@gmail.com",
				"AO79431");
		Customer customer2 = new Customer("Evanthia", "Papagianni", "2310245368", "evanthia.papagianni@gmail.com",
				"AO79432");
		Customer customer3 = new Customer("Vasilis", "Karagiannis", "2310245668", "ioannis.karagiannis@gmail.com",
				"AO79433");

		// vehicles
		Vehicle vehicle1 = new Vehicle("Mercedes", "GLC", "XKP8923", "2020", "7C3FR76A515072256");
		Vehicle vehicle2 = new Vehicle("Subaru", "Forester", "NII4269", "2018", "7C3FR76A555071465");
		Vehicle vehicle3 = new Vehicle("Ford", "Ranger", "KOH4681", "2022", "7C3FR76A55504645");

		// add customers
		if (customers.isEmpty()) {
			customers.add(customer1);
			System.out.println("New Customer has been created");
		}

		if (!customers.get(0).getArithmos_taftotitas().equals(customer2.getArithmos_taftotitas())) {
			customers.add(customer2);
			System.out.println("New Customer has been created");
		} else {
			System.out.println("Customers can not have the same aritho taftothtas!");
		}

		if (!customers.get(customers.size() - 1).getArithmos_taftotitas().equals(customer3.getArithmos_taftotitas())) {
			customers.add(customer3);
			System.out.println("New Customer has been created");
		} else {
			System.out.println("Customers can not have the same aritho taftothtas!");
		}

		// add vehicles
		if (vehicles.isEmpty()) {
			vehicles.add(vehicle1);
			System.out.println("New Vehicle has been created");
		}

		if (!vehicles.get(0).getArithmos_plaisiou().equals(vehicle2.getArithmos_plaisiou())) {
			vehicles.add(vehicle2);
			System.out.println("New Vehicle has been created");
		} else {
			System.out.println("Vehicles can not have the same aritho plaisioy!");
		}

		if (!vehicles.get(vehicles.size() - 1).getArithmos_plaisiou().equals(vehicle3.getArithmos_plaisiou())) {
			vehicles.add(vehicle3);
			System.out.println("New Vehicle has been created");
		} else {
			System.out.println("Vehicles can not have the same aritho taftothtas!");
		}

		// insurance polices
		InsurancePolicy insurancePolicy1 = new InsurancePolicy("ΜI93", "Mikti asfalisi", "6");
		InsurancePolicy insurancePolicy2 = new InsurancePolicy("B56", "Basiki asfalisi", "6");
		InsurancePolicy insurancePolicy3 = new InsurancePolicy("O58", "Me odiki", "6");

		// insurance contracts
		InsuranceContract insuranceContract1 = new InsuranceContract(customer1, vehicle1, insurancePolicy2, 60);
		InsuranceContract insuranceContract2 = new InsuranceContract(customer2, vehicle2, insurancePolicy1, 120);
		InsuranceContract insuranceContract3 = new InsuranceContract(customer2, vehicle3, insurancePolicy3, 80);

		// insurance contract details
		System.out.println("");
		System.out.println(
				insuranceContract1.getCustomer().getName() + " " + insuranceContract1.getVehicle().getPinakida() + " "
						+ insuranceContract1.getPolicy().getPerigrafi() + " " + insuranceContract1.getPrice());
		System.out.println(
				insuranceContract2.getCustomer().getName() + " " + insuranceContract2.getVehicle().getPinakida() + " "
						+ insuranceContract2.getPolicy().getPerigrafi() + " " + insuranceContract2.getPrice());
		System.out.println(
				insuranceContract3.getCustomer().getName() + " " + insuranceContract3.getVehicle().getPinakida() + " "
						+ insuranceContract3.getPolicy().getPerigrafi() + " " + insuranceContract3.getPrice());

		System.out.println("");

		// each customer's insurance vehicles
		for (Customer c : customers) {
			String line = "";
			int cost = 0;
			line += c.getName() + " ";
			if (insuranceContract1.getCustomer().getArithmos_taftotitas().equals(c.getArithmos_taftotitas())) {
				line += insuranceContract1.getVehicle().toString() + " ";
				cost += insuranceContract1.getPrice();
			}
			if (insuranceContract2.getCustomer().getArithmos_taftotitas().equals(c.getArithmos_taftotitas())) {
				line += insuranceContract2.getVehicle().toString() + " ";
				cost += insuranceContract2.getPrice();
			}
			if (insuranceContract3.getCustomer().getArithmos_taftotitas().equals(c.getArithmos_taftotitas())) {
				line += insuranceContract3.getVehicle().toString() + " ";
				cost += insuranceContract3.getPrice();
			}

			line += cost + " euros";

			System.out.println(line);

		}
	}
}
