package spring_demo;

public class Bike {
 String company;
 int cc;
 String color;
 JblMusicSystem System;
public Bike(String company, int cc, String color, JblMusicSystem system) {
	super();
	this.company = company;
	this.cc = cc;
	this.color = color;
	System = system;
}
public Bike() {
	
}
@Override
public String toString() {
	return "Bike [company=" + company + ", cc=" + cc + ", color=" + color + ", System=" + System + "]";
}

}
