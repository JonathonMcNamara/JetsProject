package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	private int packages;

	public CargoPlane(String model, double speedInMPH, int range, long price) {
		super(model, speedInMPH, range, price);
		this.packages += (int) (Math.random() * 1000);
		this.timeInAir = (range / speedInMPH);
	}

	public void loadCargo() {
		System.out.println("Loading all Cargo Jets!");
		System.out.println("Packages Loaded on " + model + ": " + packages);
	}

}
