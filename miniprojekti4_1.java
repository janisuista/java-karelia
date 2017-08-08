/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 4 / tehtävä 1
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */

import java.util.*;

public class miniprojekti4_1 {
	
  public static void main(String[] args) 
  {
      Scanner s = new Scanner(System.in);
	  
	  // Kysytään lasketaanko ympyrän pinta-alaa vai pallon tilavuutta
      System.out.print("Lasketaanko ympyrän pinta-ala vai pallon tilavuus (1=ympyrä, 2=pallo)? ");
      int sel = s.nextInt();
	  
	  // Kysytään ympyrän/pallon säde
      System.out.print("Syötä " + ((sel == 1) ? "ympyrän" : "pallon") + " säde (cm): ");
      double r = s.nextDouble();
      
	  // Tehdään laskuoperaatiot ja tulostetaan tulokset
      if(sel == 1) System.out.printf("Ympyrän pinta-ala on %.2fcm² \n", Math.PI * Math.pow(r,2));
      if(sel == 2) System.out.printf("Pallon tilavuus on %.2fcm³ \n", (4 * Math.PI * Math.pow(r,3))/3);
  }
}