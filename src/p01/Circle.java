package p01;

import p01.Geometry;

public class Circle implements Geometry {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double berechneUmfang() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public double berechneFlaeche() {
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public String toString() {
		return "Circle[radius: " + this.radius + "]";
	}
}
