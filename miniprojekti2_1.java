/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 2 / tehtävä 1
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */

import java.util.*;

public class miniprojekti2_1 
{	
    public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int[] inputs = new int[3];
		String[] msg = {"Ikäsi vuosina: ",
					    "Pituutesi senttimetreinä: ",
					    "Painosi kilogrammoina: "};
		
		// Kysytään ja tallennetaan käyttäjän ikä, pituus ja paino
		for(int i=0; i < msg.length; i++) {
			System.out.print("Syötä " + msg[i]);
			inputs[i] = s.nextInt();
		}
		
		// Kysytään omistaako käyttäjä ajokortin
		System.out.print("Omistatko ajokortin?(Y/N): ");
		String dl = s.next();
		
		// Tulostetaan käyttäjän syöttämät tiedot
		System.out.printf("Ikäsi on: %d \nPituutesi on: %dcm \nPainosi on: %dkg \n", inputs[0], inputs[1], inputs[2]);
		System.out.println(dl.equals("Y") ? "Omistat ajokortin" : "Et omista ajokorttia");
	}
}