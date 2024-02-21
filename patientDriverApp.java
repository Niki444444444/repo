package patient;

import java.util.Scanner;

public class patientDriverApp {
	public static void main(String[] args) {

		Patient myPatient = new Patient("John", "Doe", "Doee", "123 Street", 12345, "Frederick", "MD", "123-123-1232",
				"Joey Doe", "123-123-4123");

		Procedure myProcedure = new Procedure("Heart Surgery", "02/19/2024", "John Abraham", 1000000);

		Procedure myProcedure2 = new Procedure();
		myProcedure2.setProcedureName("Brain Surgery");
		myProcedure2.setProcedureDate("04/01/2024");
		myProcedure2.setPractitionerName("BARBIE");
		myProcedure2.setProcedureCharges(-100000);

		Procedure myProcedure3 = new Procedure("Hair Transplant", "08/09/2024");

		myProcedure3.setPractitionerName("tHoMaS jEfFeRsOn");
		myProcedure3.setProcedureCharges(404832);

		displayPatient(myPatient);

		displayProcedure(myProcedure);
		displayProcedure(myProcedure2);
		displayProcedure(myProcedure3);

		int totalCharges = myProcedure.getProcedureCharges() + myProcedure2.getProcedureCharges()
				+ myProcedure3.getProcedureCharges();

		System.out.println("Total Charges: " + "$" + totalCharges);
		System.out.println("Student Name: Niharika Kalkeri" + "\nMC Number: M21141870" + "\nDue Date: 02/20/2024");
		System.out.println("                  ");
	}

	public static void displayPatient(Patient P) {
		System.out.println("Name: " + P.buildFullName());
		System.out.println("Address: " + P.buildAddress());
		System.out.println("Emergency Contact: " + P.buildEmergencyContact());
		System.out.println("                ");
	}

	public static void displayProcedure(Procedure Pre) {
		System.out.println("\t" + Pre.toString());
		System.out.println("                ");
	}

}
