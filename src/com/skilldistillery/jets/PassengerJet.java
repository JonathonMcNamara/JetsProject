package com.skilldistillery.jets;

public class PassengerJet extends Jet {

	public PassengerJet(String model, double speedInMPH, int range, long price) {
		// TODO Auto-generated constructor stub
		this.model = model;
		this.speedInMPH = speedInMPH;
		this.range = range;
		this.price = price;
		this.timeInAir = (range / speedInMPH);
	}

}
