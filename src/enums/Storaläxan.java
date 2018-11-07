package enums;

public class Storaläxan {
	
public static void main(String[] args) {
	System.out.println(fahrenheitToCelsius(50));
}

	public static double fahrenheitToCelsius(double fahrenheit) { // Den här metode gör om fahrenheir till celsius
	    return (fahrenheit - 32) / 1.8;

	}
	
	public static double kelvinToCelsius(double kelvin) { // Den här metoden gör om kelvin till celsius
		return kelvin -273.15;
	}
	
    public static double fluidPressure(FluidTable fluid, double deep) { // Den här metoden räknar ut trycket på ett visst djup
    	double pressure = fluid.density*9.82*deep;
    	return pressure;
    }
    
    public static double pressureUnderWater(double deep) { // Den här metoden räknar ut villket tryck det är på ett visst djup i vatten
    	return deep*9.82*0.998*1E3;
    }
    public static double kineticEnergy(double mass, double velocity) { //En metod som räknar ut kinetisk energi med hjälp av massa och hastighet.
    	return (mass*velocity*velocity)/2;
    }
    public static double potentialEnergy(double mass, double height) { //En metod som räknar ut potentiell energi med hjälp av massa och höjd.
    	return mass*height*9.82;
    }
    public static double fallSpeed(double height) {// En metod som räknar ut hur hög hastighet man kommer upp i som man släpper ett föremål från en viss höjd.
    	return Math.sqrt(2*9.82*height);
    }
   public static double delta(double first, double last) { // En metod som räknar ut skillnad mellan två givna värden.
	   return last - first;		
	}
   public static double volumeToMass(FluidTable fluid, double volume) {// En metod som gör om en viss volym av vätska till en massa.
	   return volume*fluid.density;
   }
   public static double volumeToMass(GasTable gas, double volume) { //En metod som gör om en viss volym av gas till en massa.
	   return volume*gas.density;
   }
   public static double volumeToMass(SolidTable solid, double volume) { //En metod som gör om en viss volym av materia till en massa.
	   return volume*solid.density;
   }
   public static double svtVelocity(double distance, double time) { //En metod som räknar ut medelhastigheten med hjälp av sträcka och tid
	   return distance/time;
   }
   
	
	}

