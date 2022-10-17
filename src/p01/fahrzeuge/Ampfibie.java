package p01.fahrzeuge;

import p01.fahrzeuge.Land;
import p01.fahrzeuge.Wasser;

public class Ampfibie implements Land, Wasser {
	
	double wasserverdr;
	int raeder;
	
	@Override
	public void schwimmen() {
		System.out.println("schwimmen");
	}

	@Override
	public void fahren() {
		System.out.println("fahren");
	}

	@Override
	public double getWasserverdr() {
		return this.wasserverdr;
	}

	@Override
	public void setWasserverdr(double wasserverdr) {
		this.wasserverdr = wasserverdr;
	}

	@Override
	public int getRaeder() {
		return raeder;
	}

	@Override
	public void setRaeder(int raeder) {
		this.raeder = raeder;
	}
	
}
