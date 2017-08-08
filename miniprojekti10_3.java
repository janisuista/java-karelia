/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 10 / tehtävä 3
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */
import java.util.*;

public class miniprojekti10_3
{
	
	public static void main(String[] args)
	{
		// Joukko1, joukko2 sekä operaatioiden tulosjoukko
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(3, 5, 6, 12, 15, 18));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(2, 5, 9, 14, 15, 19));
		Set<Integer> rset = new HashSet<Integer>();
		
		rset.addAll(set1);
		
		// Unioni
		rset.addAll(set2);		
		System.out.println("Joukon 1 ja 2 unioni: " + rset);
		
		rset.clear();
		rset.addAll(set1);
		
		// Leikkaus
		rset.retainAll(set2);
		System.out.println("Joukon 1 ja 2 leikkaus: " + rset);
		
		rset.clear();
		rset.addAll(set1);
		
		// Erotus
		rset.removeAll(set2);
		System.out.println("Joukon 1 ja 2 erotus: " + rset);
	}
}