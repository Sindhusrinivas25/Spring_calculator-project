package springioc_demo;

import lombok.Data;

@Data
public class Mobile {
	String brand;
	int ram;
	String color;
	double price;
	
Airtel sim;

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public int getRam() {
	return ram;
}

public void setRam(int ram) {
	this.ram = ram;
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

public Airtel getSim() {
	return sim;
}

public void setSim(Airtel sim) {
	this.sim = sim;
}



	
}
