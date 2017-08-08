/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 5 / tehtävä 2
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */

import java.util.*;

public class miniprojekti5_2 
{	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		double width, length;
		String unit;
		
		// Kysytään käyttäjältä alueen leveys ja pituus, sekä yksikkö jossa pinta-ala tulostetaan
		System.out.print("Syötä laskettavan alueen leveys (m):");
		width = s.nextDouble();
		
		System.out.print("Syötä laskettavan alueen pituus (m):");
		length = s.nextDouble();
		
		System.out.print("Palautetaanko tulos aareina (a) vai hehtaareina (ha)? ");
		unit = s.next();
		
		// Tulostetaan lopullinen pinta-ala
		System.out.printf("Alueen laskettu pinta-ala on: %.2f%s\n", CalculateArea(width, length, unit), unit);
	}

	/**
	 * CalculateArea
	 * @param double width Käyttäjän syöttämä alueen leveys metreinä
	 * @param double length Käyttäjän syöttämä alueen pituus/korkeus metreinä
	 * @param double length Käyttäjän valitsema yksikkö jossa tulos palautetaan (a/ha)
	 * @return double Palauttaa alueen pinta-alan halutussa yksikössä
	 */
	private static double CalculateArea(double width, double length, String unit)
	{
		if(unit.equals("a")) return (width*length)/100;
		else if(unit.equals("ha")) return (width*length)/10000;
		else return 0;
	}
}