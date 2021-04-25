import java.util.Scanner;

public class GasTemperature {
	final static double GAS_CONSTANT = 8.3144621; // J / (mol*K)

	   /* Converts a pressure, volume, and number of moles 
	    of a gas to a temperature. */
	   public static double pvnToTemp(double gasPressure, double gasVolume, 
	                                  double numMoles) {
	      return (gasPressure * gasVolume) / (numMoles * GAS_CONSTANT);
	   }

	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      double gasPress;        // User defined pressure
	      double gasVol;          // User defined volume
	      double gasMoles;        // User defined moles

	      // Prompt user for input parameteres
	      System.out.print("Enter pressure (in Pascals): ");
	      gasPress = scnr.nextDouble();

	      System.out.print("Enter volume (in cubic meters): ");
	      gasVol = scnr.nextDouble();

	      System.out.print("Enter number of moles: ");
	      gasMoles = scnr.nextDouble();

	      // Call method to calculate temperature
	      System.out.print("Temperature = ");
	      System.out.println(pvnToTemp(gasPress, gasVol, gasMoles) + " K");
	      scnr.close();
	   }

}
