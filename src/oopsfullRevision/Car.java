package oopsfullRevision;

import java.util.Arrays;

public class Car {
	private String brand;
	private String colour;
	private Tyres[] t;
	private Engine e;
	
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Tyres[] getT() {
		return t;
	}
	public void setT(Tyres[] t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", colour=" + colour + ", t=" + Arrays.toString(t) + "]";
	}
	
	
}
