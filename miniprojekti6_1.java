/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 6 / tehtävä 1
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */
 
import java.util.*;

class Teos 
{
	private String author;
	private String genre;	
	private String isbn;
	private String name;
	private int pages;
	private String status;

	public void changeStatus()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Syötä teoksen uusi tila (vapaa, lainassa, kadonnut): ");
		this.status = s.nextLine();
	}
	
	public void getStatus()
	{
		System.out.println((this.status == null) ? "Tilaa ei saatavilla." : this.status);
	}
	
	public void setAttributes()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Author: " );
		this.author = s.nextLine();
		
		System.out.print("Genre: " );
		this.genre = s.nextLine();
		
		System.out.print("ISBN: " );		
		this.isbn = s.nextLine();
		
		System.out.print("Name: " );
		this.name = s.nextLine();
		
		System.out.print("Pages: " );
		this.pages = s.nextInt();
		
		System.out.print("Status: " );
		this.status = s.nextLine();
	}

	public void getAttributes()
	{
		System.out.println("Author: " + this.author);
		System.out.println("Genre: " + this.genre);
		System.out.println("ISBN: " + this.isbn);
		System.out.println("Name: " + this.name);
		System.out.println("Pages: " + this.pages);
		System.out.println("Status: " + this.status);
	}	
}

public class miniprojekti6_1 
{
	public static void main(String[] args)
	{
		int action = 0;
		Scanner s = new Scanner(System.in);
		Teos book = new Teos();
		
		do {
			System.out.println("VALIKKO | valitse numeroa vastaava toiminto.\n");
			System.out.print("1: Tallenna teoksen tiedot \n2: Tulosta teoksen tiedot \n3: Tarkista teoksen tila \n4: Muuta teoksen tilaa \n0: Lopeta \n");
			action = s.nextInt();
			
			switch (action){
				case 0: break;
				case 1: book.setAttributes();
					break;
				case 2: book.getAttributes();
					break;
				case 3: book.getStatus();
					break;
				case 4: book.changeStatus();
					break;
			}		
		}while(action != 0);
	}
}