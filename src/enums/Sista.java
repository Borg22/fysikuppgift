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
	System.out.println("uppgift 4 = " + Storal�xan.pressureUnderWater(100) + 101300);
	
	//Hur h�gt kommer bollen?
	System.out.println("uppgift 5 = " + Storal�xan.velocityToHeight(50/3.6) + "meter");
	
	//Hur stor effekt har bilens motor uppn�tt?
	System.out.println("uppgift 6 = " + Storal�xan.power(Storal�xan.work(740, 100), 4.4));
	
	//Hur m�nga g�nger stutsar bollen?
	double hopp =0;
	for (double i = 10; i > 0.5;) {
		i = Storal�xan.velocityToHeight(Storal�xan.fallSpeed(i)) - (i/100);
				hopp++;
	}
	// Hur snabbt faller jaok fr�n ett 100 m h�gt berg?
	System.out.println(Storal�xan.fallSpeed(100) + "m/s");
}

}
