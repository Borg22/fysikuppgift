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
    public static double fluidPressure(FluidTable fluid, double deep) { // Den h�r metoden r�knar ut trycket i vattnet p� ett visst djup
    	double pressure = fluid.density*G*deep;
    	reture pressure;
    }
	
	
	}

