package com.skilldistillery.jets;

public abstract class Jet {
	
//	instanceOf operator can be used in this project
//	MACH = SPEED / 770MPH
	
	public String model;
	public double speedInMPH;
	public int range;
	public long price;
	public double timeInAir;
	
	public Jet() {
		
	}
	
	
	
	
	public Jet(String model, double speedInMPH, int range, long price) {
		super();
		this.model = model;
		this.speedInMPH = speedInMPH;
		this.range = range;
		this.price = price;
		this.timeInAir = (range / speedInMPH);
	}




	public String getModel() {
		return model;
	}




	public void setModel(String model) {
		this.model = model;
	}




	public double getSpeed() {
		return speedInMPH;
	}




	public void setSpeed(double speed) {
		this.speedInMPH = speed;
	}



	public double getRange() {
		return range;
	}




	public void setRange(int range) {
		this.range = range;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(long price) {
		this.price = price;
	}
	
	
	public String jetData() {
		return "Jet Model: " + model + ", Speed: " + speedInMPH + ", Range: " + range + ", Price: $" + price;
	}
	
	public void displayJet() {
		String jetData = jetData();
		System.out.println(jetData);
	}

	public void fly() {
		String jetData = jetData();
		System.out.println(jetData + " Hours In Air: " + timeInAir);
	}

}


	

