/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 8 / tehtävä 2
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */
import java.util.*;

public class miniprojekti8_2 
{	
	private static Scanner s = new Scanner(System.in);
	
	// Metodi getName kysyy ja palauttaa käyttäjän nimen
	private static String getName()
	{	
		System.out.print("Syötä nimesi: ");
		return s.nextLine();
	}
	
	// Metodi getBD kysyy ja palauttaa käyttäjän syntymäpäivän
	private static String getBD()
	{
		System.out.print("Syötä syntymäpäiväsi: ");
		return s.nextLine();
	}
	
	public static void main(String[] args)
	{
		String name = getName();
		String birthday = getBD();
		StringBuffer output = new StringBuffer();
		
		// Yhdistetään name ja birthday ja tulostetaan yksi kokonainen merkkijono.
		System.out.println(output.append(name).append(" / ").append(birthday));
	}
}