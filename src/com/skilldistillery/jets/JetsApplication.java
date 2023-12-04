package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.Scanner;

public class JetsApplication {
	
	
	private Airfield airfield;
	private Scanner sc = new Scanner(System.in);

	public JetsApplication() {	
		this.airfield = new Airfield();
		airfield.addJets(new PassengerJet("A01" , 500, 20000, 50_000_000));
		airfield.addJets(new CargoPlane("A02" , 1234, 350000, 60_000_000));
		airfield.addJets(new CargoPlane("A03" , 5678, 500000, 70_000_000));
		airfield.addJets(new FighterJet("A04" , 9123, 12345, 100_000_000));
		airfield.addJets(new FighterJet("A05" , 4567, 67890, 150_000_000));		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JetsApplication jetsApp = new JetsApplication();
		jetsApp.run();

	}
	
	
	public void run() {
		
	while(true) {
		System.out.println("Main Menu: ");
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to the fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit");
		System.out.println("Choose One Of The Previous Selections");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: 
			listFleet();
			break;
		case 2:
			flyJets();
			break;
		case 3: 
			viewFastestJet();
			break;
		case 4:
			viewLongestRangeJet();
			break;
		case 5:
			loadCargoJets();
			break;
		case 6:
			dogfight();
			break;
		case 7:
			addJetToFleet();
			break;
		case 8:
			removeJetFromFleet();
			break;
		case 9:
			System.out.println("You have chosen to quit");
			sc.close();
			System.exit(0);
		default:
			System.out.println("Invalid selection. Choose 1 - 9");		
		}
			
	}
		
		
		
	}
	private void listFleet() {
		ArrayList<Jet> fleetJets = airfield.getJets();
		for(int i = 0; i < fleetJets.size(); i++) {
			Jet jets = fleetJets.get(i);
			String jetStuff = ((Jet) jets).jetData();
			System.out.println(jetStuff);
		}
	}
	private void flyJets() {
		for(Jet jet: airfield.getJets()) {
			jet.fly();
		}	
	}
	private void viewFastestJet() {
		Jet fastestJet = airfield.getFastestJet();
		System.out.println(fastestJet.jetData());
	}
	private void viewLongestRangeJet() {
		Jet longestRangeJet = airfield.longestRangeJet();
		System.out.println(longestRangeJet.jetData());	
	}
	private void loadCargoJets() {
		for(Jet jet: airfield.getJets()) {
			if(jet instanceof CargoCarrier) {
				((CargoPlane) jet).loadCargo();
			}
		}		
	}
	private void dogfight() {
		for(Jet jet: airfield.getJets()) {
			if(jet instanceof CombatReady) {
				((CombatReady) jet).fight();
			}
		}	
	}
	private void addJetToFleet() {
		
	}
	private void removeJetFromFleet() {
		
	}
	

}
