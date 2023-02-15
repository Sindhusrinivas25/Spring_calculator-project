package spring_demo;

public class Car {
	String brand;
	String color;
	double price;
	
	JblMusicSystem System;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public JblMusicSystem getSystem() {
		return System;
	}

	public void setSystem(JblMusicSystem system) {
		System = system;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", price=" + price + ", System=" + System + "]";
	}
	
	
	
}