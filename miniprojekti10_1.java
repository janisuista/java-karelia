/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 10 / tehtävä 1
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */
import java.util.*;

class Album
{	
	private static Scanner s = new Scanner(System.in);
	
	private String album;		// Albumin nimi
	private String artist;		// Esittäjä
	private int    year;		// Vuosi
	
	// Kysyy käyttäjältä albumin tiedot
	public void setAlbumInfo()
	{
		System.out.print("Albumi: ");
		this.album = s.nextLine();
		
		System.out.print("Esittäjä: ");
		this.artist = s.nextLine();
		
		System.out.print("Vuosi: ");
		this.year = s.nextInt();
		s.nextLine();
	}
	
	// Palauttaa albumin tiedot valmiina merkkijonona
	public String getAlbumInfo()
	{
		return String.format("Album: %s\nArtist: %s\nYear: %s", this.album, this.artist, this.year);
	}
}

class Catalog
{
	private static Scanner s = new Scanner(System.in);
	private Vector<Object> vector = new Vector<Object>();
	
	// Lisää levykokoelmaan uuden albumin tiedot
	public void addAlbum()
	{
		Album newalbum = new Album();
		newalbum.setAlbumInfo();
		vector.add(newalbum.getAlbumInfo());
	}
	
	// Poistaa käyttäjän syöttämän indeksin omaavan albumin tiedot
	public void deleteAlbum()
	{
		System.out.print("Poistettavan levyn indeksi:");
		vector.remove(s.nextInt());
	}
	
	// Tulostaa käyttäjän syöttämän indeksin omaavan albumin tiedot
	public void showAlbum()
	{
		Object[] catalog = vector.toArray();
		
		System.out.print("Haettavan levyn indeksi:");
		int idx = s.nextInt();
		System.out.println("---#" + idx + "---\n" + catalog[idx] + "\n");
	}	
	
	// Tulostaa koko levykokoelman 
	public void showCatalog()
	{
		Object[] catalog = vector.toArray();
		
		for(int i = 0; i<catalog.length; i++){
			System.out.println("---#" + i + "---\n" + catalog[i] + "\n");
		}		
	}
	
}

public class miniprojekti10_1
{
	public static void main(String[] args)
	{
		String[] menu = {"Lisää levy kokoelmaan", "Hae tietyn levyn tiedot", "Poista levy kokoelmasta", "Näytä kaikki kokoelman levyt"};
		
		Catalog catalog = new Catalog();
		Scanner s 		= new Scanner(System.in);
		int action 		= 0;
		
		// Pyöritellään ohjelmaa kunnes käyttäjä syöttää 0
		do {
			try{
				System.out.println("\nVALIKKO | valitse numeroa vastaava toiminto.\n");
				for(int i = 0; i < menu.length; i++) {
    				System.out.println(i+1 + ": " + menu[i]);
				}
				
				action = s.nextInt();
				
				switch (action){
					case 0: 
						break;
					case 1: catalog.addAlbum();
						break;
					case 2: catalog.showAlbum();
						break;
					case 3: catalog.deleteAlbum();
						break;
					case 4: catalog.showCatalog();
						break;						
					default:
						break;
				} 
			}catch(InputMismatchException e){
				System.out.printf("Invalid action. Program closed.\n");
			}
			
		}while(action != 0);
	}
}