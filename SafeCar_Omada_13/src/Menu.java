import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	/*
	 * Η κλάση Menu αντιπροσωπεύει όλες τις κλάσεις διεπαφής και βοηθάει στην
	 * αποφυγή παραπανίσιων πληροφοριών στην main. Συμπεριλήφθηκε για ευχρηστία και
	 * εμπλούτιση του κώδικα!
	 */

	// for keyboard input
	Scanner keyboard = new Scanner(System.in);

	// login options
	public int loginOption() {

		System.out.println("[0] Please login as Owner: ");
		System.out.println("[1] Please login as Εmployee/Agent: ");
		System.out.println("[2] Exit: ");
		int option = keyboard.nextInt();

		// check for correct values
		if (option != 0 && option != 1 && option != 2) {
			System.out.println("Please enter a valid option: 0, 1 or 2");
			option = keyboard.nextInt();
		}

		return option;
	}

	// owner login
	public boolean ownerLogin(Idiokthths owner) {

		boolean isOwner = false;
		String name;
		int password;

		// authentication loop
		while (!isOwner) {
			System.out.println("Name: ");
			name = keyboard.next();

			System.out.println("Password: ");
			password = keyboard.nextInt();

			// check if credentials are correct
			if (name.equals(owner.getOnoma()) && password == owner.getKwdikos()) {
				System.out.println("Welcome back " + owner.getOnoma() + "!");
				isOwner = true;
			} else {
				System.out.println("Wrong Credentials!");
			}
		}

		return isOwner;
	}

	// employee login
	public Ypallhlos employeeLogin(ArrayList<Ypallhlos> ypallhloi) {
		Ypallhlos curYpal = null;
		String name;
		int password;
		boolean searching = true;
		boolean exists = false;
		int index = 0;

		// authentication loop
		while (searching) {

			System.out.println("Name: ");
			name = keyboard.next();

			System.out.println("Password: ");
			password = keyboard.nextInt();

			// check if employee exists
			for (int i = 0; i < ypallhloi.size(); i++) {
				if (ypallhloi.get(i).getOnoma().equals(name)) {
					exists = true;
					index = i;
				}

			}

			// check if passwords match
			if (exists) {
				if (password == ypallhloi.get(index).getKwdikos()) {
					curYpal = ypallhloi.get(index);
					System.out.println("Welcome " + curYpal.getOnoma() + "!");
					searching = false;
				} else {
					System.out.println("Wrong Credentials");
				}
			} else {
				System.out.println("Wrong Credentials");
			}
		}
		return curYpal;

	}

	// owner operations menu
	public int ownerOptions() {

		System.out.println("---------------------------------------------");
		System.out.println("[0] Check esoda: " + "\n[1] Check eksoda: " + "\n[2] Check asfalhseis: "
				+ "\n[3] Check empolee of the month: " + "\n[4] Check pelates: " + "\n[5] Check co-operating etairies: "
				+ "\n[6] Check oxhmata: " + "\n[7] Check paketa: " + "\n[8] Back: ");
		System.out.println("---------------------------------------------");
		int option = keyboard.nextInt();
		// check for correct input
		if (option != 0 && option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6
				&& option != 7 && option != 8) {
			System.out.println("Please enter a valid option: 0, 1, 2, 3, 4, 5, 6, 7 or 8");
			option = keyboard.nextInt();
		}

		return option;
	}

	// employee operations menu
	public int employeeOptions() {

		System.out.println("---------------------------------------------");
		System.out.println("[0] Add paketo: " + "\n[1] Add pelath: " + "\n[2] Add oxhma: " + "\n[3] Make aithsh: "
				+ "\n[4] Back: ");
		System.out.println("---------------------------------------------");
		int option = keyboard.nextInt();
		// check for correct input
		if (option != 0 && option != 1 && option != 2 && option != 3 && option != 4) {
			System.out.println("Please enter a valid option, 0, 1, 2, 3 or 4");
			option = keyboard.nextInt();
		}

		return option;
	}

}
