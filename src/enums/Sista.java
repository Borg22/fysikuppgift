package enums;

public class Sista {
	
public static void main(String[] args) {
	
	//Hur mycket v�ger 80dm^3
	System.out.println("uppgift 1 = " + Storal�xan.volumeToMass(SolidTable.IRON,0.080) + "KG");

	// Hur l�ngt hinner Tonka om han har medelhastigheten 2.8m/s i 60 minuter? 
	System.out.println("uppgift 2 = " + Storal�xan.svtDistance(2.8, 60 * 60));
	
	//Hur mycket kr�vs det f�r att v�rma upp 5 liter vatten?
	System.out.println("uppgift 3 = "+ Storal�xan.heat(FluidTable.WATER, 0.005, 1));
	
	//Hur stort �r det totala trycket 100 meter under havsytan?
	System.out.println("uppgift 4 = " + Storal�xan.pressureUnderWater(100) + );
}

}
