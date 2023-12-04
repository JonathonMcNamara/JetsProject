package com.skilldistillery.jets;

import java.util.ArrayList;

public class Airfield {

	private ArrayList<Jet> jets;
	
	public Airfield() {
		this.jets = new ArrayList<>();
	}

	public void addJets(Jet j) {
		jets.add(j);
		
	}
	
	public ArrayList<Jet> getJets() {
		return jets;
	}
	
	public Jet getFastestJet() {
		Jet fastestJet = jets.get(0);
		for(Jet jet: jets) {
			if(jet.getSpeed() > fastestJet.getSpeed()) {
				fastestJet = jet;
			}
		}
		return fastestJet;
	}
	public Jet longestRangeJet() {
		Jet bestRangeJet = jets.get(0);
		for(Jet jet: jets) {
			if(jet.getRange() > bestRangeJet.getRange()) {
				bestRangeJet = jet;
			}
		}
		return bestRangeJet;
	}
	

}

