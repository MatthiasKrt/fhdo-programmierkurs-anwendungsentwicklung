package p01.aufg4;

public class Testklasse {
	public static void main(String[] args) {
		Person p1 = new Person("Bernd", "Dortmund", "Emil-Figge-Strasse", "44225");
		Person p2 = new Person("Peter", "Unna", "Morgenstrasse", "59423");
		
		RefinedPerson p1R = new RefinedPerson("Bernd", "Dortmund", "Emil-Figge-Strasse", "44225", "Berni");
		RefinedPerson p2R = new RefinedPerson("Peter", "Unna", "Morgenstrasse", "59423", "Petta");
		
		System.out.println("Vergleiche P1(" + p1.getName() +  ") und P2(" + p2.getName() + "): " + p1.equals(p2));
		System.out.println("Vergleiche P1(" + p1.getName() +  ") und P1(" + p1.getName() + "): " + p1.equals(p1));
		System.out.println("Vergleiche P2(" + p2.getName() +  ") und P1(" + p1.getName() + "): " + p2.equals(p1));
		System.out.println("Vergleiche P2(" + p2.getName() +  ") und P2(" + p2.getName() + "): " + p2.equals(p2));
		
		System.out.println();
		
		System.out.println("Vergleiche P1R(" + p1R.getName() +  ") und P2R(" + p2R.getName() + "): " + p1R.equals(p2R));
		System.out.println("Vergleiche P1R(" + p1R.getName() +  ") und P1R(" + p1R.getName() + "): " + p1R.equals(p1R));
		System.out.println("Vergleiche P1R(" + p1R.getName() +  ") und P1(" + p1.getName() + "): " + p1R.equals(p1));
		System.out.println("Vergleiche P1(" + p1.getName() +  ") und P1R(" + p1R.getName() + "): " + p1.equals(p1R));
		System.out.println("Vergleiche P2R(" + p2R.getName() +  ") und P1R(" + p1R.getName() + "): " + p2R.equals(p1R));
		System.out.println("Vergleiche P2R(" + p2R.getName() +  ") und P2R(" + p2R.getName() + "): " + p2R.equals(p2R));
		System.out.println("Vergleiche P2R(" + p2R.getName() +  ") und P2(" + p2R.getName() + "): " + p2R.equals(p2));
		System.out.println("Vergleiche P2(" + p2.getName() +  ") und P2R(" + p2R.getName() + "): " + p2.equals(p2R));
	}
}
