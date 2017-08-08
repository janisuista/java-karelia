/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 8 / tehtävä 3
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */
import java.util.*;

public class miniprojekti8_3 
{	
	// Lauseenjäsenten taulukot
	private static String[] preds = {"Drives", "Does", "Climbs", "Slams", "Rolls", "Revivals", "Eats", "Thinks" };
	private static String[] subs  = {"Jack Sparrow", "Mother Teresa", "Ron Jeremy", "Donald Trump", "Brad Pitt", "Santaclaus", "Timo Soini", "Simon Cowell"};
	private static String[] objs  = {"Bread", "Keyboard", "Monitor", "Beer Can", "Mercedes Benz", "Puck", "Bicycle", "Anvil"};
	private static String[] adjs  = {"Wonderful", "Kinky", "Horny", "Clunky", "Selfish", "Dirty", "Heavy", "Arrogant"};
	
	// Metodi generoi ja palauttaa kokonaisen lauseen
	private static String SurrealSentence()
	{
		String sentence ="";
		
		// Arvotaan jokaisesta merkkijonotaulukosta satunnainen alkio ja lisätään se lauseeseen
		sentence += " " + getRandom(adjs);
		sentence += " " + getRandom(subs);
		sentence += " " + getRandom(preds);
		sentence += " " + getRandom(adjs);	
		sentence += " " + getRandom(objs);
		
		return sentence;	
	}
	
	private static String getRandom(String[] array) 
	{
		int idx = new Random().nextInt(array.length);
		return array[idx];
	}	
	
	public static void main(String[] args)
	{	
		// Generoidaan 10kpl lauseita ja tulostetaan ne testiksi
		for(int i=0; i < 10; i++) {
			System.out.println(SurrealSentence());
		}
	}	
}