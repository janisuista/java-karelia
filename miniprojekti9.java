/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 9 / tehtävä 1
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */
import java.util.*;
import java.io.*;

class asiakas
{
	private static Scanner s = new Scanner(System.in);	// Skanneri
	private int	   id;									// Asiakkaan id
	private String name;								// Asiakkaan nimi
	private String mail;								// Asiakkaan email	
	private String tel;									// Asiakkaan puhelinnumero
	
	// Asettaa olion ominaisuudet. Kutsutaan saveToFile-metodista käsin.
	private void setCustomer()
	{
		System.out.print("ID: ");
		this.id = s.nextInt();
		s.nextLine();
		System.out.print("Nimi: ");
		this.name = s.nextLine();
		System.out.print("E-Mail: ");
		this.mail = s.nextLine();	
		System.out.print("Puhnro: ");
		this.tel = s.nextLine();			
	}
	
	// Kysyy ja tallentaa asiakkaan tiedot data.txt-tiedostoon
	public void saveToTxt()
	{
		// Kysytään ja asetetaan tiedot
		this.setCustomer();
		
		// Yritetään avata tiedosto, sekä kirjoittaa tiedot ko. tiedostoon.
		try{
			BufferedWriter w = new BufferedWriter(new FileWriter("data.txt",true));

			w.write("Customer #"+ this.id);
			w.newLine();
			w.write("Name: "	+ this.name);
			w.newLine();
			w.write("E-Mail: "	+ this.mail);
			w.newLine();		
			w.write("Phone: "	+ this.tel);
			w.newLine();

			w.close();
		} 
		
		// Napataan ja tulostetaan poikkeukset
		catch(FileNotFoundException e) {
			System.out.println("File not found.");
			System.exit(1);
		}	
		catch(IOException e){
			System.out.println("Something went wrong.");
			System.exit(1);		
		}	
		catch(Exception e){
			System.out.println("Something went wrong.");
			System.exit(1);		
		}
	}
	
	// Kysyy ja tallentaa asiakkaan tiedot data.bin-tiedostoon
	public void saveToBin()
	{
		try{
			this.setCustomer();
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.bin",true));

			oos.writeObject("Customer #"+ this.id);
			oos.writeObject("Name: "	+ this.name);
			oos.writeObject("E-Mail: "	+ this.mail);		
			oos.writeObject("Phone: "	+ this.tel);

			oos.close();
			
		} catch(Exception e){
			System.out.println("Something went wrong.");
			System.exit(1);		
		}	
	}
	
	// Hakee tiedostosta id:n perusteella halutun asiakkaan tiedot ja tulostaa ne.
	public void getInfo()
	{
		System.out.print("Syötä haettavan asiakkaan id-numero: ");
		int id = s.nextInt();
		
		// Yritetään avata tiedosto, sekä lukea tiedostoa
		try{
			BufferedReader r = new BufferedReader(new FileReader("data.txt"));
			String row;
			
			// Luetaan rivi kerralla, mikäli rivi on "Customer #x" tulostetaan myös kolme seuraavaa riviä
			while((row = r.readLine()) != null){
				if(row.contains("Customer #" + id)){
					System.out.println(row);
					
					for(int i = 0; i < 3; i++){
						System.out.println(r.readLine());
					}
				}	
			}	
		}
		
		// Napataan ja tulostetaan poikkeukset
		catch(FileNotFoundException e) {
			System.out.println("File not found.");
			System.exit(1);
		}
		catch(IOException e){
			System.out.println("Something went wrong.");
			System.exit(1);		
		}
		
		catch(Exception e){
			System.out.println("Something went wrong.");
			System.exit(1);		
		}		
	}
	
	// Tulostaa rivi kerrallaan tekstitiedoston jokaisenrivin
	public void getInfoAll()
	{
		try{
			BufferedReader r = new BufferedReader(new FileReader("data.txt"));
			String row;
			
			while((row = r.readLine()) != null){
				System.out.println(row);
			}	
		} 
		// Napataan ja tulostetaan poikkeukset
		catch(FileNotFoundException e) {
			System.out.println("File not found.");
			System.exit(1);
		}
		catch(IOException e){
			System.out.println("Something went wrong.");
			System.exit(1);		
		}
		
		catch(Exception e){
			System.out.println("Something went wrong.");
			System.exit(1);		
		}		
	}
}

public class miniprojekti9
{
	public static void main(String[] args)
	{
		String[] menu = {"Lisää asiakas (.txt)", "Lisää asiakas (.bin)", "Hae asiakkaan tiedot", "Hae kaikkien asiakkaiden tiedot"};
		int action = 0;
		
		asiakas Customer = new asiakas();	
		Scanner s 		 = new Scanner(System.in);
		
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
					case 1: Customer.saveToTxt();
						break;
					case 2: Customer.saveToBin();
						break;						
					case 3: Customer.getInfo();
						break;
					case 4: Customer.getInfoAll();
						break;
				} 
			}catch(InputMismatchException e){
				System.out.printf("Invalid action. Program closed.\n");
			}
				
		}while(action != 0);
	}
}