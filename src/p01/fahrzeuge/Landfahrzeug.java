package p01.fahrzeuge;

public class Landfahrzeug implements Land{
	
	int raeder;
	
	@Override
	public void fahren() {
		System.out.println("fahren");
	}

	@Override
	public int getRaeder() {
		return this.raeder;
	}

	@Override
	public void setRaeder(int raeder) {
		this.raeder = raeder;
	}

}
