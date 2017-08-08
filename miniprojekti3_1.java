/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 3 / tehtävä 1
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */

import java.util.*;
import java.io.*;

public class miniprojekti3_1 
{	
    public static void main(String[] args) throws FileNotFoundException
	{
		try {
			// Luodaan Scanner-luokan oliot sekä tiedostonkäsittelylle, että käyttäjän syötteille
			Scanner sf = new Scanner(new File("weekdays.ini"));
			Scanner s  = new Scanner(System.in);

			List<String> days = new ArrayList<String>();			
			
			// Luetaan alustustiedoston jokainen rivi taulukkoon
			while (sf.hasNextLine()) {
				days.add(sf.nextLine());
			}
			
			System.out.println("Ohjelma pyytää sinua valitsemaan päivän ja kielen,ja tulostaa kyseisen päivän kyseisellä kielellä.\n");

			// Pyydetään käyttäjältä kieltä vastaava kokonaisluku 1-3 ja tallennetaan se muuttujaan
			System.out.print("Millä kielellä haluat tulostuksen (1=Suomi, 2=Englanti, 3=Ranska)? ");
			int lang = s.nextInt();

			// Pyydetään käyttäjältä päivää vastaava kokonaisluku 1-7 ja tallenetaan se muuttujaan
			System.out.print("Minkä päivän nimen haluat tietää (1=maanantai, ..., 7=sunnuntai)? ");
			int day = s.nextInt();
			
			int idx = 0;
			String lang_dec = "";
			
			// Määritellään käyttäjän syöttämää numeroa vastaavan kielen kirjoitusasu, sekä halutun kielisen viikonpäivän indeksi
			switch(lang){
				case 1: 
					idx  = day-1;
					lang_dec = "suomeksi";
					break;
				case 2:
					idx = day + 6;
					lang_dec = "englanniksi";
					break;
				case 3:
					idx = day + 13;
					lang_dec = "ranskaksi";
					break;
				default:
					break;
			}
			
			// Tulostetaan viikonpäivä halutulla kielellä ja lopetetaan ohjelma
			System.out.printf("%d. päivä %s on %s \n", day, lang_dec, days.get(idx));
			return;
		}
		// Mikäli tiedoston avaaminen ei onnistu
		catch (FileNotFoundException e) {
			System.out.print("Tiedostoa ei voitu avata.");
		}
	}
}