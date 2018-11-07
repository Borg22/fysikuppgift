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
	
	}

