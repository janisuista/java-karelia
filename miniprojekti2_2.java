/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 2 / tehtävä 2
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */

import java.util.*;

public class miniprojekti2_2 
{	
	private static final int days = 7;
	
    public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		double[] arr = new double[days];
		
		// Kysytään ja tallennetaan taulukkoon jokaisen viikonpäivän sademäärä
		for(int i=0; i < days; i++) {
			System.out.printf("Anna %d. päivän sademäärä (mm): ", i+1);
			arr[i] = s.nextDouble();
		}
		
		// Tulostetaan jokaisen päivän sademäärät
		for(int i=0; i < arr.length; i++)
			System.out.printf("%d. päivän sademäärä oli: %.1f mm\n", i+1, arr[i]);
	}
}