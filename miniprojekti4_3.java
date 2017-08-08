/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 4 / tehtävä 3
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */

import java.util.*;

public class miniprojekti4_3 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int y=0;
		
		System.out.println("Ohjelma kyselee vuosilukuja ja palauttaa kyseisen vuoden päivien lukumäärät.\n(-1 lopettaa ohjelman)");
		
		// Kysellään vuosilukuja niin kauan kunnes käyttäjä syöttää -1
		while(y != -1){		
			System.out.print("Syötä vuosiluku: ");
			y = s.nextInt();
			
			// Jos vuosiluku on -1, poistutaan ohjelmasta
			if(y == -1) break;
			
			// Muutoin tulostetaan päivien määrä kyseisenä vuonna
			else System.out.printf("Vuonna %d oli päiviä yhteensä %d kpl.\n", y, GetDaysByYear(y));
		}		
	}
	
	// Tutkii onko parametrina syötetty vuosiluku karkausvuosi ja palauttaa ko. vuoden päivien lukumäärän
	public static int GetDaysByYear(int y)
	{	
		if(y % 400 == 0) return 366; // On karkausvuosi
		if(y % 100 == 0) return 365; // Ei ole karkausvuosi
		if(y % 4 == 0) return 366;   // On karkausvuosi
		return 365;				
	}
}