package javaClassesObjects;

public class Car {
	private String make, model;
	private int year;

	public Car() {
	}

	public Car(String make, String model) {
		this.make = make;
		this.model = model;
	}

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
}
