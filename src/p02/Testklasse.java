package p02;

import java.util.Scanner;

public class Testklasse {
	private static Einkaufswagen<Kaese> einkaufswagenKaese = new Einkaufswagen<>();
	private static Einkaufswagen<Wurst> einkaufswagenWurst = new Einkaufswagen<>();
	private static Einkaufswagen<Brot> einkaufswagenBrot = new Einkaufswagen<>();
	
	private static Nahrungsmittel k1 = new Kaese("K1", 3);
	private static Nahrungsmittel k2 = new Kaese("K2", 1.5f);
	private static Nahrungsmittel k3 = new Kaese("K3", 12.2f);
	
	private static Nahrungsmittel fk1 = new Frischkaese("FK1", 3);
	private static Nahrungsmittel fk2 = new Frischkaese("FK2", 1.4f);
	private static Nahrungsmittel fk3 = new Frischkaese("FK3", 4.4f);
	
	private static Nahrungsmittel sfk1 = new Superfrischkaese("SFK1", 1);
	private static Nahrungsmittel sfk2 = new Superfrischkaese("SFK2", 1);
	private static Nahrungsmittel sfk3 = new Superfrischkaese("SFK3", 1);
	
	private static Nahrungsmittel w1 = new Wurst("W1", 1);
	private static Nahrungsmittel w2 = new Wurst("W2", 4);
	private static Nahrungsmittel w3 = new Wurst("W3", 7.1f);
	
	private static Nahrungsmittel b1 = new Brot("B1", 0.5f);
	private static Nahrungsmittel b2 = new Brot("B2", 4.5f);
	private static Nahrungsmittel b3 = new Brot("B3", 1.7f);
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		int eingabe = 0;
		Nahrungsmittel[] produkte = {k1, k2, k3, w1, w2, w3, b1, b2, b3, fk1, fk2, fk3, sfk1, sfk2, sfk3};
		
		do {
			System.out.println("Produktnummer eingeben:");
			
			for(int i = 1; i <= produkte.length; i++) {
				System.out.print(i + ": ");
				System.out.println(produkte[i-1].getName());
			}
			
			System.out.print("\nGeben Sie die Produktnummer ein (0 zum beenden): ");
			
			eingabe = s.nextInt();
			
			if(eingabe > 0 && eingabe <= produkte.length) {
				Nahrungsmittel selected = produkte[eingabe - 1];
				
				System.out.println("Möchten Sie das Produkt " + selected.name + " zum Einkaufswagen[1] oder zum Haushaltsbuch[2] hinzufügen.");
				int addEingabe = s.nextInt();
				
				if(addEingabe == 1) {
					if(eingabe <= 3) {
						Kaese k = (Kaese) selected;
						einkaufswagenKaese.hinzufuegen(k);
					} else if(eingabe <= 6) {
						Wurst w = (Wurst) selected;
						einkaufswagenWurst.hinzufuegen(w);
					} else if(eingabe <= 9) {
						Brot b = (Brot) selected;
						einkaufswagenBrot.hinzufuegen(b);
					} else if(eingabe <= 12) {
						Kaese k = (Frischkaese) selected;
						einkaufswagenKaese.hinzufuegen(k);
					} else if(eingabe <= 15) {
						Kaese k = (Superfrischkaese) selected;
						einkaufswagenKaese.hinzufuegen(k);
					}
				} else if(addEingabe == 2) {
					System.out.println("Welche Menge soll hinzugefügt werden?");
					double menge = s.nextDouble();
					haushaltsbuch(selected, menge);
				}
			} else {
				eingabe = 0;
			}
		} while (eingabe != 0);
		
		System.out.println("Einkaufswagen Kaese");
		einkaufswagenKaese.ausgeben();
		
		System.out.println("Einkaufswagen Wurst");
		einkaufswagenWurst.ausgeben();
		
		System.out.println("Einkaufswagen Brot");
		einkaufswagenBrot.ausgeben();
	}
	
	public static <T extends Nahrungsmittel, X extends Number> void haushaltsbuch(T produkt, X menge) {
		System.out.print(produkt.name + ": ");
		System.out.print(menge + " = ");
		System.out.println(produkt.preis * menge.doubleValue());
	}
}
