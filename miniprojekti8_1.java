/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 8 / tehtävä 1
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */
import java.util.*;

public class miniprojekti8_1 
{	
	public static void main(String[] args)
	{	
		// Muutamia tutkittavia merkkijonopareja sisältävät taulukot
		String[] words1 = {"racecar", "silenceisgolden", "georgebond", "marilynmonroe" };
		String[] words2  = {"ccarrea", "goldenisnotsilence", "JamesBond", "RolainRommeyn"};
		
		// Testataan metodin toimintaa
		for(int i=0; i < words1.length; i++) {
			if(isAnagram(words1[i], words2[i]))
				System.out.printf("%s ja %s ovat toistensa anagrammeja.\n", words1[i], words2[i]);
			else
				System.out.printf("%s ja %s eivät ole toistensa anagrammeja.\n", words1[i], words2[i]);
		}
	}
	
	// Metodi isAnagram tutkii ovatko kaksi parametrina saamaa merkkijonoa toistensa anagrammeja.
	public static boolean isAnagram(String str1, String str2)
	{
		// Hajotetaan merkkijonot
		char[] a = str1.toLowerCase().toCharArray();
		char[] b = str2.toLowerCase().toCharArray();
		
		// Järjestetään merkkijonotaulukko uudelleen
		Arrays.sort(a);
		Arrays.sort(b);
		
		// Verrataan ja palautetaan vertailusta totuusarvo
		return Arrays.equals(a, b);
	}
}

