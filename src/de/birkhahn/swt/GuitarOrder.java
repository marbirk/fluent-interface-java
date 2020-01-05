package de.birkhahn.swt;

public class GuitarOrder {
	String category;
	String model;
	String brand;
	String color;
	int index;
	int pickups;
	boolean caseIncluded;
	boolean payment;
 
	public GuitarOrder(){};
	public GuitarOrder(int index, String category){
		this.index = index;
		this.category = category;
	}
	public GuitarOrder model(String model){
		this.model = model;
		return this;
	}
	public GuitarOrder brand(String brand){
		this.brand = brand;
		return this;
	}
	public GuitarOrder countOfPickups(int pickups) {
		this.pickups = pickups;
		return this;
	}
	public GuitarOrder color(String color) {
		this.color = color;
		return this;
	}
	public GuitarOrder caseIncluded() {
		this.caseIncluded = true;
		return this;
	}
	public GuitarOrder payWithCash() {
		this.payment = true;
		return this;
	}
	public GuitarOrder payWithCard() {
		this.payment = false;
		return this;
	}
	public String toString(){
		return 
			"Guitar Order " + this.index +
			"\nCategory: " + this.category + 
			"\nModel: " + this.model + 
			"\nBrand: " + this.brand + 
			"\nColor: " + this.color +
			"\nCount of pickups: " + this.pickups +
			"\nCase included: " + this.caseIncluded +
			"\nPay with Cash: " + this.payment + 
			"\n"
			;
	}
}
