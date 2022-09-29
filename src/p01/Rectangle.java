package p01;

import java.util.Objects;

public class Rectangle {
	private int breite;
	private int hoehe;
	
	public Rectangle(int breite, int hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	public int getBreite() {
		return breite;
	}
	public void setBreite(int breite) {
		this.breite = breite;
	}
	public int getHoehe() {
		return hoehe;
	}
	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}
	
	@Override
	public String toString() {
		return "Rectangle [hashCode: " + this.hashCode() + ", breite: " + this.breite + ", hoehe: " + this.hoehe + "]";
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		
		result = PRIME * result + hoehe;
		result = PRIME * result + breite;
		
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Rectangle other = (Rectangle) obj;
		return this.breite == other.getBreite() && this.hoehe == other.getHoehe();
	}
	
	
}
