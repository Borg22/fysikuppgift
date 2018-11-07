package enums;

public class Storaläxan {
	
public static void main(String[] args) {
	System.out.println(fahrenheitToCelsius(50));
}
//Steg 1/Den här metode gör om fahrenheir till celsius.
	public static double fahrenheitToCelsius(double fahrenheit) { 
	    return (fahrenheit - 32) / 1.8;
	}
	// Steg 2/Den här metoden gör om kelvin till celsius.
	public static double kelvinToCelsius(double kelvin) { 
		return kelvin -273.15;
	}
	// Steg3/Den här metoden räknar ut trycket på ett visst djup.
    public static double fluidPressure(FluidTable fluid, double deep) { 
    	double pressure = fluid.density*9.82*deep;
    	return pressure;
    } 
 // Steg4/Den här metoden räknar ut villket tryck det är på ett visst djup i vatten.
    public static double pressureUnderWater(double deep) { 
    	return deep*9.82*0.998*1E3;
    }
  //Steg5/En metod som räknar ut kinetisk energi med hjälp av massa och hastighet.
    public static double kineticEnergy(double mass, double velocity) { 
    	return (mass*velocity*velocity)/2;
    }
  //Steg6/En metod som räknar ut potentiell energi med hjälp av massa och höjd.
    public static double potentialEnergy(double mass, double height) { 
    	return mass*height*9.82;
    }
 // Steg7/En metod som räknar ut hur hög hastighet man kommer upp i som man släpper ett föremål från en viss höjd.
    public static double fallSpeed(double height) {
    	return Math.sqrt(2*9.82*height);
    }
    // Steg8/En metod som räknar ut skillnad mellan två givna värden.
   public static double delta(double first, double last) {
	   return last - first;		
   }
// Steg9/En metod som gör om en viss volym av vätska till en massa.
   public static double volumeToMass(FluidTable fluid, double volume) {
	   return volume*fluid.density;
   }
 //Steg10/En metod som gör om en viss volym av gas till en massa.
   public static double volumeToMass(GasTable gas, double volume) { 
	   return volume*gas.density;
   }
 //Steg11/En metod som gör om en viss volym av materia till en massa.
   public static double volumeToMass(SolidTable solid, double volume) { 
	   return volume*solid.density;
   }
   //Steg12/En metod som räknar ut medelhastigheten med hjälp av sträcka och tid.
   public static double svtVelocity(double distance, double time) {
	   return distance/time;
   }
 //Steg13/En metod som räknar ut sträcka med hjälp av hastighet och tid.
   public static double svtDistance(double velocity, double time) {
	   return velocity*time;
   }
 //Steg14/En metod som räknar ut tid för hjälp av sträcka och hastighet.
   public static double svtTime(double distance, double velocity) {
	   return distance / velocity;
   }
 //Steg15/En metod som räknar ut arbete med hjälp av kraft och sträcka.
   public static double work(double force, double distance) {
	   return force*distance;
   }
 //Steg16/En metod som räknar ut effekt med hjälp av arbete och tid.
   public static double power(double work, double time) { 
	   return work/time;
   }
 //Steg17/En metod som räknar ut hur mycket energi som krävs för att värma ett visst material ett angivet antal grader.
   public static double heat(SolidTable solid, double mass, double deltaT) {
	   return mass*solid.heatCapacity*deltaT;
   }
 //Steg18/En metod som räknar ut hur mycket energi som krävs för att värma en viss volym vätska ett angivet antal grader.
   public static double heat(FluidTable fluid, double volume, double deltaT) {
	   return volume*fluid.density*fluid.heatCapacity*deltaT;
   }
 //Steg19/En metod som räknar ut hur mycket energi som krävs för att värma en viss volym gas ett angivet antal grader.
   public static double heat(GasTable gas, double volume, double deltaT) {
	   return volume*gas.density*gas.heatCapacity*deltaT;
   }
// Steg20/En metod som räknar ut hur högt ett föremål med en viss hastighet uppåt kommer.
   public static double velocityToHeight(double velocity) { 
	   return Math.pow(velocity, 2)/(2*9.82);
   }
	
	}

