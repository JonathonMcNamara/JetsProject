package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady{
	
	private int rockets;

	public FighterJet(String model, double speedInMPH, int range, long price) {
		super(model, speedInMPH, range, price);
		this.rockets += (int)(Math.random()* 10);
		this.timeInAir = (range / speedInMPH);
	}
	
	public FighterJet() {
		
	}

	@Override
	public void fight() {
		System.out.println("Loading rockets onto FighterJets");
		System.out.println(model + "now has " + rockets + " rockets loaded");
	}

}
