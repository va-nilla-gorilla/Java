
import java.util.Scanner;


public class ResistorVoltage {
	public static void main(String[] args) {
	      try (Scanner scnr = new Scanner(System.in)) {
			final int NUM_RES = 5;                   // Number of resistors
			  double[] resVals = new double[NUM_RES];  // Ohms
			  double circVolt;                         // Volts
			  double[] vDrop = new double[NUM_RES];    // Volts
			  double currentVal;                       // Amps
			  double sumRes;                           // Ohms
			  int i;                                   // Loop index

			  System.out.println("5 resistors are in series.");
			  System.out.println("This program calculates the");
			  System.out.println("voltage drop across each resistor.\n");

			  System.out.print("Input voltage applied to circuit: ");
			  circVolt = scnr.nextDouble();

			  System.out.println("Input ohms of " + NUM_RES + " resistors:");
			  for (i = 0; i < resVals.length; ++i) {
			     System.out.print((i + 1) + ") ");
			     resVals[i] = scnr.nextDouble();
			  }

			  // Calculate current
			  sumRes = 0;
			  for (i = 0; i < resVals.length; ++i) {
			     sumRes = sumRes + resVals[i];
			  }
			  currentVal = circVolt / sumRes;    // I = V/R

			  for (i = 0; i < vDrop.length; ++i) {
			     vDrop[i] = currentVal * resVals[i]; // V = IR
			  }

			  System.out.println("\nVoltage drop per resistor is:");
			  for (i = 0; i < vDrop.length; ++i) {
			     System.out.println((i + 1) + ") "
			             + "" + vDrop[i] + " V");    
			  }
			  
		}
	}

}
