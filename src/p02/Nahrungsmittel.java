package p02;

public abstract class Nahrungsmittel {
	protected String name;
	protected float preis;
	
	public Nahrungsmittel(String name, float preis) {
		this.name = name;
		this.preis = preis;
	}
	
	public String getName() {
		return name;
	}
	
	public float getPreis() {
		return preis;
	}
}
