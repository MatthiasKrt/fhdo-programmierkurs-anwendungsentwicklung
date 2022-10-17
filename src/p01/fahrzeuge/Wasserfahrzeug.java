package p01.fahrzeuge;

public class Wasserfahrzeug implements Wasser {
	
	double wasserverdr;

	@Override
	public void schwimmen() {
		System.out.println("schwimmen");
	}

	@Override
	public double getWasserverdr() {
		return this.wasserverdr;
	}

	@Override
	public void setWasserverdr(double wasserverdr) {
		this.wasserverdr = wasserverdr;
	}

}
