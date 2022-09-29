package p01;

public class Testklasse {
	
	public static void main(String[] args) {
		System.out.println("Aufgabe 1");
		aufg1();
		
		System.out.println("Aufgabe 2");
		aufg2();
	}
	
	public static void aufg1() {
		Rectangle rec1 = new Rectangle(5, 5);
		Rectangle rec2 = new Rectangle(7, 3);
		
		System.out.println("Rectangle 1: " + rec1.toString());
		System.out.println("Rectangle 2: " + rec2.toString());
		
		System.out.println("Vergleich (Rectangle 1 = Rectangle 2): " + rec1.equals(rec2));
	}
	
	public static void aufg2() {
		Rectangle rec1 = new Rectangle(5, 5);
		Rectangle rec2 = new Rectangle(7, 3);
		Rectangle rec3 = new Rectangle(3, 5);
		Rectangle rec4 = new Rectangle(1, 2);
		
		Circle circle1 = new Circle(4);
		Circle circle2 = new Circle(1);
		Circle circle3 = new Circle(5);
		Circle circle4 = new Circle(9);
		
		Geometry[] formen = {rec1, rec2, rec3, rec4, circle1, circle2, circle3, circle4};
		
		for(Geometry g : formen) {
			System.out.print(g.toString());
				
			System.out.print("\t Flaeche: " + g.berechneFlaeche());
			System.out.println("\t Umfang: " + g.berechneUmfang());
		}
	}
}
