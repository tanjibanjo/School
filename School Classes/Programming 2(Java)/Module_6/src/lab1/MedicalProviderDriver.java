//************************************************************************
// Author: Lane Pollock
// Date: 14 Nov 2024
// Language: Java
// Assignment: Lab 1: Medical Provider
// Description: Driver class that demonstrates the MedicalProvider
//  classes and their polymorphism
//************************************************************************


package lab1;

import java.util.ArrayList;

public class MedicalProviderDriver {

	public static void main(String[] args) {
		//local variables
		//instance of OfficeLocation to use in providers
		OfficeLocation location = new OfficeLocation(
				"Primary Care Location 4", "San Antonio", "78240", 
				"123 Main St.", "Texas");
		
		//instances of nurses and doctors
		MedicalProvider doctor1 = new Doctor("Lane", "Pollock", "D5678",
				location, 520000, "Cardiologist", "L5432");
		MedicalProvider doctor2 = new Doctor("Sally", "Smith", "D1234",
				location, 520000, "Internal Medicine", "L9876");
		
		MedicalProvider nurse1 = new Nurse("Frank", "Nightingale", 
				"N1234", location, "LVN", 20, 50);
		MedicalProvider nurse2 = new Nurse("Penny", "Johnson", "N9876",
				location, "RN", 25, 50);
		
		
		//list to hold medical providers
		ArrayList<MedicalProvider> providers = 
									new ArrayList<MedicalProvider>();
		
		//add to list
		providers.add(doctor1);
		providers.add(doctor2);
		providers.add(nurse1);
		providers.add(nurse2);
		
		//loop through list and print information
		for(MedicalProvider provider : providers) {
			System.out.println(provider);
			System.out.println();
		}

	}

}
