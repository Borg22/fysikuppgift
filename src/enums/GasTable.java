package enums;

public enum GasTable{

	AIR(1.29, 1.01), 
	O2(1.43, 0.92), 
	OXYGEN(1.43, 0.92),
	HELIUM(0.18, 5.1),
	CHLORINE(3.21, 0.50),
	;

	double density;
	double heatCapacity;

	GasTable(double d, double hc) {
		density = d;
		heatCapacity = hc * 1E3; // 1E3 = 1*10^3
	}

}
