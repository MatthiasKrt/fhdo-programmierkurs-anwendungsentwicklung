package p02;

public class Einkaufswagen<T extends Nahrungsmittel> {
	private Nahrungsmittel[] produkte = new Nahrungsmittel[10];
	
	public void hinzufuegen(T produkt) {
		for(int i = 0; i < 10; i++) {
			if(produkte[i] == null) {
				produkte[i] = produkt;
				break;
			}
		}
	}
	
	public void ausgeben() {
		System.out.println("Einkaufswagen:");
		for(int i = 0; i < 10; i++) {
			if(produkte[i] != null) {
				System.out.println(produkte[i].getName());
			} else {
				System.out.println("Leer");
			}
		}
		System.out.println();
	}
}
