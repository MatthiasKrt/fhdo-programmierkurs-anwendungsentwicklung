package p02;

import java.util.Scanner;

public class Testklasse {
	public static void main(String[] args) {
		Einkaufswagen<Kaese> einkaufswagenKaese = new Einkaufswagen<>();
		Einkaufswagen<Wurst> einkaufswagenWurst = new Einkaufswagen<>();
		Einkaufswagen<Brot> einkaufswagenBrot = new Einkaufswagen<>();
		
		Nahrungsmittel k1 = new Kaese("K1", 3);
		Nahrungsmittel k2 = new Kaese("K2", 1.5f);
		Nahrungsmittel k3 = new Kaese("K3", 12.2f);
		
		Nahrungsmittel w1 = new Wurst("W1", 1);
		Nahrungsmittel w2 = new Wurst("W2", 4);
		Nahrungsmittel w3 = new Wurst("W3", 7.1f);
		
		Nahrungsmittel b1 = new Brot("B1", 0.5f);
		Nahrungsmittel b2 = new Brot("B2", 4.5f);
		Nahrungsmittel b3 = new Brot("B3", 1.7f);
		
		Scanner s = new Scanner(System.in);
		int eingabe = 0;
		Nahrungsmittel[] produkte = {k1, k2, k3, w1, w2, w3, b1, b2, b3};
		
		do {
			System.out.println("Produktnummer auswählen, wird in Einkaufsagen gelegt:");
			
			for(int i = 1; i <= produkte.length; i++) {
				System.out.print(i + ": ");
				System.out.println(produkte[i-1].getName());
			}
			
			System.out.print("\nGeben Sie die Produktnummer ein (0 zum beenden): ");
			
			eingabe = s.nextInt();
			
			if(eingabe > 0 && eingabe <= produkte.length) {
				if(eingabe <= 3) {
					Kaese k = (Kaese) produkte[eingabe - 1];
					einkaufswagenKaese.hinzufuegen(k);
				} else if(eingabe <= 6) {
					Wurst w = (Wurst) produkte[eingabe - 1];
					einkaufswagenWurst.hinzufuegen(w);
				} else if(eingabe <= 9) {
					Brot b = (Brot) produkte[eingabe - 1];
					einkaufswagenBrot.hinzufuegen(b);
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
}
