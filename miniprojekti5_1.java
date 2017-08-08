/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 5 / tehtävä 1
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;

public class miniprojekti5_1 
{	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String date = "";
		String str[] = {"vuosi", "kuukausi", "päivä" };
		String formatList[] = {"yyyy-MM-dd", "d.M.yyyy", "d. MMMM yyyy"};
		
		// Kysytään käyttäjältä vuosi, kk, päivä, sekä haluttu formaatti jossa päivämäärä tulostetaan
		for(int i=0; i<3; i++) {
			System.out.print("Syötä " + str[i] + ": ");
			date = date + s.next() + "/";
		}

		System.out.printf("Valitse formaatti (0 = %s 1 = %s, 2 = %s):", formatList[0], formatList[1], formatList[2]);
		String format = formatList[s.nextInt()];
		
		// Formatoidaan päivämäärä ja tulostetaan se käyttäjälle. Ellei formatointi onnistu, tulostetaan poikkeus.
		try {
			System.out.println(ConvertDate(date, format));

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ConvertDate
	 * @param String inputDate Käyttäjän syöttämä päivämäärä
	 * @param String outputFormat Käyttäjän valitsema päivämäärän muoto
	 * @return Date Palauttaa formatoidun päivämäärän
	 */
    private static String ConvertDate(String inputDate, final String outputFormat) throws ParseException 
	{
		final String inputFormat = "yyyy/M/dd";
        return new SimpleDateFormat(outputFormat).format(new SimpleDateFormat(inputFormat).parse(inputDate));
    }	
}