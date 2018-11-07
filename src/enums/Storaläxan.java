package enums;

public class Storaläxan {
	
public static void main(String[] args) {
	System.out.println(fahrenheitToCelsius(50));
}
/**Steg 1/Den här metode gör om fahrenheir till celsius.
 * 
 * @param fahrenheit
 * @return
 */
	public static double fahrenheitToCelsius(double fahrenheit) { 
	    return (fahrenheit - 32) / 1.8;
	}
	/** Steg 2/Den här metoden gör om kelvin till celsius.
	 * 
	 * @param kelvin
	 * @return
	 */
	public static double kelvinToCelsius(double kelvin) { 
		return kelvin -273.15;
	}
	/** Steg3/Den här metoden räknar ut trycket på ett visst djup.
	 * 
	 * @param fluid
	 * @param deep
	 * @return
	 */
    public static double fluidPressure(FluidTable fluid, double deep) { 
    	double pressure = fluid.density*9.82*deep;
    	return pressure;
    } 
 /** Steg4/Den här metoden räknar ut villket tryck det är på ett visst djup i vatten.
  * 
  * @param deep
  * @return
  */
    public static double pressureUnderWater(double deep) { 
    	return deep*9.82*0.998*1E3;
    }
  /**Steg5/Den här metoden räknar ut kinetisk energi med hjälp av massa och hastighet.
   * 
   * @param mass
   * @param velocity
   * @return
   */
    public static double kineticEnergy(double mass, double velocity) { 
    	return (mass*velocity*velocity)/2;
    }
  /**Steg6/Den här metoden räknar ut potentiell energi med hjälp av massa och höjd.
   * 
   * @param mass
   * @param height
   * @return
   */
    public static double potentialEnergy(double mass, double height) { 
    	return mass*height*9.82;
    }
 /** Steg7/Den här metoden räknar ut hur hög hastighet man kommer upp i som man släpper ett föremål från en viss höjd.
  * 
  * @param height
  * @return
  */
    public static double fallSpeed(double height) {
    	return Math.sqrt(2*9.82*height);
    }
    /** Steg8/Den här metoden räknar ut skillnad mellan två givna värden.
     * 
     * @param first
     * @param last
     * @return
     */
   public static double delta(double first, double last) {
	   return last - first;		
   }
/**Steg9/Den här metoden gör om en viss volym av vätska till en massa.
 * 
 * @param fluid
 * @param volume
 * @return
 */
   public static double volumeToMass(FluidTable fluid, double volume) {
	   return volume*fluid.density;
   }
 /**
  * Steg10/Den här metoden gör om en viss volym av gas till en massa.
  * @param gas
  * @param volume
  * @return
  */
   public static double volumeToMass(GasTable gas, double volume) { 
	   return volume*gas.density;
   }
 /**Steg11/Den här metoden gör om en viss volym av materia till en massa.
  * 
  * @param solid
  * @param volume
  * @return
  */
   public static double volumeToMass(SolidTable solid, double volume) { 
	   return volume*solid.density;
   }
   /**Steg12/Den här metoden räknar ut medelhastigheten med hjälp av sträcka och tid.
    * 
    * @param distance
    * @param time
    * @return
    */
   public static double svtVelocity(double distance, double time) {
	   return distance/time;
   }
 /**Steg13/Den här metoden räknar ut sträcka med hjälp av hastighet och tid.
  * 
  * @param velocity
  * @param time
  * @return
  */
   public static double svtDistance(double velocity, double time) {
	   return velocity*time;
   }
 /**Steg14/Den här metoden räknar ut tid för hjälp av sträcka och hastighet.
  * 
  * @param distance
  * @param velocity
  * @return
  */
   public static double svtTime(double distance, double velocity) {
	   return distance / velocity;
   }
 /**Steg15/Den här metoden räknar ut arbete med hjälp av kraft och sträcka.
  * 
  * @param force
  * @param distance
  * @return
  */
   public static double work(double force, double distance) {
	   return force*distance;
   }
 /**Steg16/Den här metoden räknar ut effekt med hjälp av arbete och tid.
  * 
  * @param work
  * @param time
  * @return
  */
   public static double power(double work, double time) { 
	   return work/time;
   }
 /**Steg17/Den här metoden räknar ut hur mycket energi som krävs för att värma ett visst material ett angivet antal grader.
  * 
  * @param solid
  * @param mass
  * @param deltaT
  * @return
  */
   public static double heat(SolidTable solid, double mass, double deltaT) {
	   return mass*solid.heatCapacity*deltaT;
   }
 /**Steg18/Den här metoden räknar ut hur mycket energi som krävs för att värma en viss volym vätska ett angivet antal grader.
  * 
  * @param fluid
  * @param volume
  * @param deltaT
  * @return
  */
   public static double heat(FluidTable fluid, double mass, double deltaT) {
	   return mass*fluid.density*fluid.heatCapacity*deltaT;
   }
 /**Steg19/Den här metoden räknar ut hur mycket energi som krävs för att värma en viss volym gas ett angivet antal grader.
  * 
  * @param gas
  * @param volume
  * @param deltaT
  * @return
  */
   public static double heat(GasTable gas, double volume, double deltaT) {
	   return volume*gas.density*gas.heatCapacity*deltaT;
   }
/** Steg20/Den här metoden räknar ut hur högt ett föremål med en viss hastighet uppåt kommer.
 * 
 * @param velocity
 * @return
 */
   public static double velocityToHeight(double velocity) { 
	   return Math.pow(velocity, 2)/(2*9.82);
   }
	
	}

