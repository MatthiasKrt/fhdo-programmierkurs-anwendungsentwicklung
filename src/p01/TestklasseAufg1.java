package p01;

public class TestklasseAufg1 {
	
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(5, 5);
		Rectangle rec2 = new Rectangle(7, 3);
		
		System.out.println("Rectangle 1: " + rec1.toString());
		System.out.println("Rectangle 2: " + rec2.toString());
		
		System.out.println("Vergleich (Rectangle 1 = Rectangle 2): " + rec1.equals(rec2));
	}
	
}
