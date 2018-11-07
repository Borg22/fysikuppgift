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
    public static double fluidPressure(FluidTable fluid, double deep) { // Den här metoden räknar ut trycket i vattnet på ett visst djup
    	double pressure = fluid.density*G*deep;
    	reture pressure;
    }
	
	
	}

