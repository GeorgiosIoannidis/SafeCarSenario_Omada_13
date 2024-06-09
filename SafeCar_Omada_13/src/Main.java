import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		/*
		 * Η main συνδέεται με την κλάση "Σύστημα" που υπάρχει διάγραμμα καθώς
		 * εξυπηρετεί βασικές λειτουργίες. Δυστυχώς λόγω περιπλοκότητας λειτουργιών όπως
		 * οι ηχητικές εισόδοι και ενημερώσεις δεν ήταν εφικτό να υλοποιηθούν.
		 */

		// menu class
		Menu menu = new Menu();

		// for keyboard input
		Scanner keyboard = new Scanner(System.in);

		// idiokthths class
		Idiokthths owner = new Idiokthths("admin", 1914);

		// ypallhloi classes
		Ypallhlos ypallhlos1 = new Ypallhlos("tasos", 2001, 0);
		Ypallhlos ypallhlos2 = new Ypallhlos("nikos", 2000, 0);

		// etairies classes
		Etairia etairia1 = new Etairia("2345", "Ins1", "Papanastasiou 20");
		Etairia etairia2 = new Etairia("4356", "Ins2", "Aristotelous 2");

		// ypallhlos session
		Ypallhlos currentYpalhlos = null;

		// statistics class
		Statistika statistics = new Statistika(0, 0, 0);

		// Lists of data used
		ArrayList<Pelaths> pelates = new ArrayList<Pelaths>();
		ArrayList<Oxhma> oxhmata = new ArrayList<Oxhma>();
		ArrayList<Paketo> paketa = new ArrayList<Paketo>();
		ArrayList<Etairia> etairies = new ArrayList<Etairia>();
		ArrayList<Ypallhlos> ypallhloi = new ArrayList<Ypallhlos>();

		// add ypallhlous to the list
		ypallhloi.add(ypallhlos1);
		ypallhloi.add(ypallhlos2);

		// add etairies to the list
		etairies.add(etairia1);
		etairies.add(etairia2);

		// main program loop
		while (true) {
			System.out.println("Welcome to Safe Car !");

			// login options menu
			int loginOption = menu.loginOption();

			// chose login option
			if (loginOption == 0) {
				// idiokthths login
				if (menu.ownerLogin(owner)) {
					int ownerOptions;
					// idiokthths mode main loop
					while (true) {
						// chose operations menu
						ownerOptions = menu.ownerOptions();
						if (ownerOptions == 0) {
							System.out.println("---------------------------------------------");
							// show esoda
							statistics.emfanhseEsoda();
						} else if (ownerOptions == 1) {
							System.out.println("---------------------------------------------");
							// show eksoda
							statistics.emfanhseEksoda();
						} else if (ownerOptions == 2) {
							System.out.println("---------------------------------------------");
							// show how many asfalhseis were done
							statistics.emfanhseAsfalhseis();
						} else if (ownerOptions == 3) {
							System.out.println("---------------------------------------------");
							// show ypallhlo of the month
							statistics.emfanhseYpallhloMhna(ypallhloi);
						} else if (ownerOptions == 4) {
							System.out.println("---------------------------------------------");
							// check if list is empty
							if (pelates.isEmpty()) {
								System.out.println("Currently 0 pelates");
							} else {
								// print all pelates
								for (int i = 0; i < pelates.size(); i++) {
									pelates.get(i).printData(i);
								}
							}
						} else if (ownerOptions == 5) {
							System.out.println("---------------------------------------------");
							// check if list is empty
							if (etairies.isEmpty()) {
								System.out.println("Currently 0 co-operating etairies");
							} else {
								// print all etairies
								for (int i = 0; i < etairies.size(); i++) {
									etairies.get(i).printData(i);
								}
							}
						} else if (ownerOptions == 6) {
							System.out.println("---------------------------------------------");
							// check if list is empty
							if (oxhmata.isEmpty()) {
								System.out.println("Currently 0 oxhmata");
							} else {
								// print all oxhmata
								for (int i = 0; i < oxhmata.size(); i++) {
									oxhmata.get(i).printData(i);
								}
							}
						} else if (ownerOptions == 7) {
							System.out.println("---------------------------------------------");
							// check if list is empty
							if (paketa.isEmpty()) {
								System.out.println("Currently 0 paketa");
							} else {
								// print all paketa
								for (int i = 0; i < paketa.size(); i++) {
									paketa.get(i).printData(i);
								}
							}
						} else {
							// exit owner loop
							break;
						}
					}

				}
			} else if (loginOption == 1) {
				// check for ypallhlos session
				if (currentYpalhlos == null) {
					// ypallhlos login
					currentYpalhlos = menu.employeeLogin(ypallhloi);
				} else {
					String res;
					// change ypallhlo or stay with current session
					while (true) {
						System.out.println("Login as " + currentYpalhlos.getOnoma() + " y/n ?");
						res = keyboard.next();
						if (!res.equals("n") && !res.equals("y")) {
							System.out.println("Please enter y or n !");
						} else {
							break;
						}
					}
					// ypallhlos login
					if (res.equals("n")) {
						currentYpalhlos = menu.employeeLogin(ypallhloi);
					}
				}
				int employOptions;
				// ypallhlos main loop
				while (true) {
					// ypallhlos mode operations
					employOptions = menu.employeeOptions();
					if (employOptions == 0) {
						// add new paketo
						System.out.println("Kwdikos paketoy: ");
						int kwdikos = keyboard.nextInt();

						System.out.println("Typos paketoy: ");
						String typos = keyboard.next();

						// check if values are correct
						int diarkeia;
						while (true) {
							System.out.println("Diarkeia paketoy: ");
							diarkeia = keyboard.nextInt();
							if (diarkeia <= 0) {
								System.out.println("Diarkeia must be greater than 0! ");
							} else {
								break;
							}
						}

						// check if paketo does already exist
						boolean unique = !paketa.isEmpty();
						int i = 0;

						while (unique && i < paketa.size()) {
							if (paketa.get(i).getKwdikos() == kwdikos) {
								System.out.println("Paketo '" + kwdikos + "' already exists!");
								unique = false;
							}
							i++;
						}
						// if everything is right then add it to the list
						if (unique || paketa.isEmpty()) {
							paketa.add(new Paketo(diarkeia, kwdikos, typos));
							System.out.println("New paketo added!");
						}
					} else if (employOptions == 1) {
						// add pelath
						System.out.println("Onoma pelath: ");
						String onoma = keyboard.next();

						System.out.println("Epitheto pelath: ");
						String epitheto = keyboard.next();

						System.out.println("Arithmos Taytothas pelath: ");
						String at = keyboard.next();

						System.out.println("Kinhto pelath: ");
						String kin = keyboard.next();

						// check if pelaths does already exist
						boolean unique = !pelates.isEmpty();
						int i = 0;

						while (unique && i < pelates.size()) {
							if (pelates.get(i).getArithmosTaytothtas().equals(at)) {
								System.out.println("Pelaths with arithmo taytothas '" + at + "' already exists!");
								unique = false;
							}
							i++;
						}
						// if everything is right then add it to the list
						if (unique || pelates.isEmpty()) {
							pelates.add(new Pelaths(onoma, epitheto, at, kin));
							System.out.println("New customer added!");
						}
					} else if (employOptions == 2) {
						// add oxhma
						System.out.println("Marka oxhmatos: ");
						String marka = keyboard.next();

						System.out.println("Montelo oxhmatos: ");
						String montelo = keyboard.next();

						System.out.println("Pinakida oxhmatos: ");
						String pinakida = keyboard.next();

						// check if oxhma does already exist
						boolean unique = !oxhmata.isEmpty();
						int i = 0;

						while (unique && i < oxhmata.size()) {
							if (oxhmata.get(i).getPinakida().equals(pinakida)) {
								System.out.println("Oxhma with pinakida '" + pinakida + "' already exists!");
								unique = false;
							}
							i++;
						}
						// if everything is right then add it to the list
						if (unique || oxhmata.isEmpty()) {
							oxhmata.add(new Oxhma(marka, montelo, pinakida));
							System.out.println("New oxhma added!");
						}
					} else if (employOptions == 3) {

						// check if lists are empty
						if (paketa.isEmpty()) {
							System.out.println("Please add paketo");
						} else if (pelates.isEmpty()) {
							System.out.println("Please add pelates");
						} else if (oxhmata.isEmpty()) {
							System.out.println("Please add oxhmata");
						} else {
							// make aithsh
							System.out.println("Select pelath: ");
							for (int i = 0; i < pelates.size(); i++) {
								// print available pelates
								pelates.get(i).printData(i);
							}
							// select pelath
							int pel;
							while (true) {
								System.out.println("Select number: ");
								pel = keyboard.nextInt();
								if (pel < 0 || pel > pelates.size()) {
									System.out.println("Please select a valid number: ");
								} else {
									break;
								}
							}

							System.out.println("Select oxhma: ");
							for (int i = 0; i < oxhmata.size(); i++) {
								// print available oxhmata
								oxhmata.get(i).printData(i);
							}
							// select oxhma
							int ox;
							while (true) {
								System.out.println("Select number: ");
								ox = keyboard.nextInt();
								if (ox < 0 || ox > oxhmata.size()) {
									System.out.println("Please select a valid number: ");
								} else {
									break;
								}
							}

							System.out.println("Select paketo: ");
							for (int i = 0; i < paketa.size(); i++) {
								// print available paketa
								paketa.get(i).printData(i);
							}
							// select paketo
							int pak;
							while (true) {
								System.out.println("Select number: ");
								pak = keyboard.nextInt();
								if (pak < 0 || pak > paketa.size()) {
									System.out.println("Please select a valid number: ");
								} else {
									break;
								}
							}

							// create new aithsh
							AithshAsfalishs ait = new AithshAsfalishs(pelates.get(pel), paketa.get(pak),
									oxhmata.get(ox));

							// estimate aithsh cost for pelath
							int cost = ait.ypologismosKostous(statistics);
							// submit aithsh
							ait.ypobolh(currentYpalhlos, statistics);

							// print new aithsh
							System.out.println(
									"New aithsh at " + cost + " euros for " + ait.getStoixeiaPelath().getOnoma() + " "
											+ ait.getStoixeiaPelath().getEpitheto() + " was made!");

						}
					} else {
						// exit ypallhlos operations loop
						break;
					}
				}
			} else {
				break;
			}
		}
		// close keyboard recourse
		keyboard.close();
		// exit app
		System.exit(0);
	}
}