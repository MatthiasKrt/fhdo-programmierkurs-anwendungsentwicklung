package p01.aufg4;

public class Testklasse {
	public static void main(String[] args) {
		Person p1 = new Person("Bernd", "Dortmund", "Emil-Figge-Strasse", "44225");
		Person p2 = new Person("Peter", "Unna", "Morgenstrasse", "59423");
		
		System.out.println("Vergleiche P1(" + p1.getName() +  ") und P2(" + p2.getName() + "): " + p1.equals(p2));
		System.out.println("Vergleiche P1(" + p1.getName() +  ") und P1(" + p1.getName() + "): " + p1.equals(p1));
		System.out.println("Vergleiche P2(" + p2.getName() +  ") und P1(" + p1.getName() + "): " + p2.equals(p1));
		System.out.println("Vergleiche P2(" + p2.getName() +  ") und P2(" + p2.getName() + "): " + p2.equals(p2));
	}
}
