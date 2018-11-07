package enums;

public class Sista {
	
public static void main(String[] args) {
	
	//Hur mycket väger 80dm^3
	System.out.println("uppgift 1 = " + Storaläxan.volumeToMass(SolidTable.IRON,0.080) + "KG");

	// Hur långt hinner Tonka om han har medelhastigheten 2.8m/s i 60 minuter? 
	System.out.println("uppgift 2 = " + Storaläxan.svtDistance(2.8, 60 * 60));
	
	//Hur mycket krävs det för att värma upp 5 liter vatten?
	System.out.println("uppgift 3 = "+ Storaläxan.heat(FluidTable.WATER, 0.005, 1));
	
	//Hur stort är det totala trycket 100 meter under havsytan?
	System.out.println("uppgift 4 = " + Storaläxan.pressureUnderWater(100) + );
}

}
