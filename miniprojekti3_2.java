/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 3 / tehtävä 2
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */

import java.util.*;

public class miniprojekti3_2 
{	
	private static final int mm = 12;
	
  	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		// double-tyypin taulukko
		double[] income = new double[mm];
		
		// Kysytään ja tallennetaan taulukkoon jokaisen kuukauden tulot
		for(int i=0; i < mm; i++) {
			System.out.printf("Anna %d. kuukauden tulo: ", i+1);
			income[i] = s.nextInt();
		}
		
		// Esitellään DoubleSummaryStatistics-luokka taulukon statistiikan hakua helpottamaan
		DoubleSummaryStatistics stat = Arrays.stream(income).summaryStatistics();
		
		// Kokonaistulot
		System.out.printf("Kokonaistulot ovat %.1f\n", stat.getSum());
		
		// Keskimääräinen tulo
        System.out.printf("Keskiarvoinen kuukausikohtainen tulo on %.1f\n", stat.getAverage());
		
		// Maksimi kuukausitulo
		System.out.printf("Suurin kuukausikohtainen tulo on %.1f\n", stat.getMax());
		return;
	}
}