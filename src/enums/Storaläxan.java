package enums;

public class Storal�xan {
	
public static void main(String[] args) {
	System.out.println(fahrenheitToCelsius(50));
}

	public static double fahrenheitToCelsius(double fahrenheit) { // Den h�r metode g�r om fahrenheir till celsius
	    return (fahrenheit - 32) / 1.8;

	}
	
	public static double kelvinToCelsius(double kelvin) { // Den h�r metoden g�r om kelvin till celsius
		return kelvin -273.15;
	}
	
    public static double fluidPressure(FluidTable fluid, double deep) { // Den h�r metoden r�knar ut trycket p� ett visst djup
    	double pressure = fluid.density*9.82*deep;
    	return pressure;
    }
    
    public static double pressureUnderWater(double deep) { // Den h�r metoden r�knar ut villket tryck det �r p� ett visst djup i vatten
    	return deep*9.82*0.998*1E3;
    }
    public static double kineticEnergy(double mass, double velocity) { //En metod som r�knar ut kinetisk energi med hj�lp av massa och hastighet.
    	return (mass*velocity*velocity)/2;
    }
    public static double potentialEnergy(double mass, double height) { //En metod som r�knar ut potentiell energi med hj�lp av massa och h�jd.
    	return mass*height*9.82;
    }
    public static double fallSpeed(double height) {// En metod som r�knar ut hur h�g hastighet man kommer upp i som man sl�pper ett f�rem�l fr�n en viss h�jd.
    	return Math.sqrt(2*9.82*height);
    }
   public static double delta(double first, double last) { // En metod som r�knar ut skillnad mellan tv� givna v�rden.
	   return last - first;		
	}
   public static double volumeToMass(FluidTable fluid, double volume) {// En metod som g�r om en viss volym av v�tska till en massa.
	   return volume*fluid.density;
   }
   public static double volumeToMass(GasTable gas, double volume) { //En metod som g�r om en viss volym av gas till en massa.
	   return volume*gas.density;
   }
   public static double volumeToMass(SolidTable solid, double volume) { //En metod som g�r om en viss volym av materia till en massa.
	   return volume*solid.density;
   }
   public static double svtVelocity(double distance, double time) { //En metod som r�knar ut medelhastigheten med hj�lp av str�cka och tid
	   return distance/time;
   }
   
	
	}

