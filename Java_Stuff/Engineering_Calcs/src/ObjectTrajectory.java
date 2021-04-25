import java.util.Scanner;

public class ObjectTrajectory {
	final static double PI_CONST = 3.14159265;

	   // Given time, angle, velocity, and gravity
	   // Update x and y values
	   public static void objectTrajectory(double t, double a, double v,
	           double g, double[] x, double[] y) {
	      x[0] = v * t * Math.cos(a);
	      y[0] = v * t * Math.sin(a) - 0.5 * g * t * t;
	   }

	   // convert degree value to radians
	   public static double degToRad(double deg) {
	      return ((deg * PI_CONST) / 180.0);
	   }

	   public static void main(String[] args) {
	      try (Scanner scnr = new Scanner(System.in)) {
			final double GRAVITY = 9.8;     // Earth gravity (m/s^2)
			  double launchAngle;             // Angle of launch (rad)
			  double launchVelocity;          // Velocity (m/s)
			  double elapsedTime;             // Time (s)

			  double[] xLoc = new double[1];  // Object's height above ground (m)
			  double[] yLoc = new double[1];  // Object's'horiz. dist. from start (m)

			  elapsedTime = 1.0;
			  xLoc[0] = -1.0;
			  yLoc[0] = 0.0;

			  System.out.print("Launch angle (deg): ");
			  launchAngle = scnr.nextDouble();
			  launchAngle = degToRad(launchAngle);  // To radians

			  System.out.print("Launch velocity (m/s): ");
			  launchVelocity = scnr.nextDouble();

			  System.out.print("Initial height (m): ");
			  yLoc[0] = scnr.nextDouble();

			  while (yLoc[0] > 0.0) {  // While above ground
			     System.out.println("Time " + elapsedTime + "   x = " + xLoc[0]
			             + "   y = " + yLoc[0]);
			     objectTrajectory(elapsedTime, launchAngle, launchVelocity, 
			                      GRAVITY, xLoc, yLoc);
			     elapsedTime = elapsedTime + 1.0;
			  }
		}
	   }

}
