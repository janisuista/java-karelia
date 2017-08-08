/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 7 / tehtävä 1 & 2
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */
 
import java.util.*;

abstract class Animal
{
	protected String name;
	protected String alive;
	
	
	public String getName()
	{
		return this.name;
	}
	public String getAlive()
	{
		return this.alive;
	}
	
	private void setName(String name)
	{
		this.name = name;
	}
	public void setAlive(String isalive)
	{
		this.alive = isalive;
	}

	public void newName()
	{
		Scanner s = new Scanner(System.in);	
		System.out.print("Anna eläimelle nimi: ");
		setName(s.nextLine());
	}
	public void isAlive()
	{
		Scanner s = new Scanner(System.in);	
		System.out.print("Onko eläin elossa?: ");
		setAlive(s.nextLine());
	}	
	
	abstract void Speak();
}

class Cat extends Animal
{
	private int lives=9;
	
	public int getLives()
	{
		return this.lives;
	}
	
	public void decreaseLives(int n)
	{
		this.lives = this.lives-n;
	}
	
	public void showProperties()
	{
		System.out.printf("Kissan nimi: %s\n",getName());
		System.out.printf("Elossa/Kuollut : %s\n",getAlive());
		System.out.printf("Kissalla on %d elämää\n", getLives()); 
	}
	
	void Speak()
	{
		System.out.println("Miumaumiuamiauumaiuagrrrrr!");
	}	
}

class Parrot extends Animal
{
	private String mymaster;
	
	public String getMaster()
	{
		return this.mymaster;
	}
	
	public void setMaster(String master)
	{
		this.mymaster = master;
	}
	
	public void showProperties()
	{
		System.out.printf("Papukaijan nimi: %s\n",getName());
		System.out.printf("Elossa/Kuollut : %s\n",getAlive());
		System.out.printf("Papukaijan isäntä on: %s\n", getMaster()); 
	}	

	void Speak()
	{
		System.out.println("KVAAAAAKKWAAAAAK!");
	}	
}

class Sheep extends Animal
{
	private int color = 1;
	
	public int getColor()
	{
		return this.color;	
	}
	
	public void toggleColor()
	{
		if(this.color == 0) this.color = 1;
		else this.color = 0;
	}
	
	public void showProperties()
	{
		System.out.printf("Lampaan nimi: %s\n",getName());
		System.out.printf("Elossa/Kuollut : %s\n",getAlive());
		System.out.printf("Lammas on väriltään: %s\n", (getColor() == 1 ? "Valkoinen" : "Musta")); 
	}
	
	void Speak()
	{
		System.out.println("BÄÄÄÄÄÄÄHBÄÄÄÄÄÄÄÄH!");
	}	
}

public class miniprojekti7_1_2
{
	public static void main(String[] args)
	{
		String[] menu = {"Muuta kissan tietoja", "Muuta papukaijan tietoja", "Muuta lampaan tietoja", "Näytä kissan tiedot", "Näytä papukaijan tiedot", "Näytä lampaan tiedot"};
		int action = 0;
		Scanner s = new Scanner(System.in);
		
		Parrot parrot = new Parrot();
		Sheep sheep = new Sheep();
		Cat cat = new Cat();
		
		Animal animals[] = new Animal[3];
		animals[0] = cat;
		animals[1] = parrot;
		animals[2] = sheep;

		for(int i=0; i<3; i++){
			animals[i].Speak();
		}
		
		do {
			try{
				System.out.println("\nVALIKKO | valitse numeroa vastaava toiminto.\n");
				for(int i = 0; i < menu.length; i++) {
    				System.out.println(i+1 + ": " + menu[i]);
				}
				action = s.nextInt();
				
				switch(action){
					case 1:
						cat.newName();
						System.out.print("Onko eläin elossa? (kuollut/elossa): ");
						cat.setAlive(s.nextLine());
						s.nextLine();
						System.out.print("Vähennä kissan elämiä? (0-9): ");
						cat.decreaseLives(s.nextInt());
						break;
					case 2:	
						parrot.newName();
						System.out.print("Onko eläin elossa? (kuollut/elossa): ");
						parrot.setAlive(s.nextLine());
						s.nextLine();
						System.out.print("Anna papukaijan isännän nimi: ");
						parrot.setMaster(s.nextLine());
						break;
					case 3:	
						sheep.newName();
						System.out.print("Onko eläin elossa?: (kuollut/elossa)");
						sheep.setAlive(s.nextLine());
						s.nextLine();
						System.out.print("Haluatko vaihtaa lampaan väriä? (y/n)");
						if(s.nextLine().equals("y"))
							sheep.toggleColor();						
						break;
					case 4: 
						cat.showProperties();
						break;
					case 5: 
						parrot.showProperties();	
						break;
					case 6: 
						sheep.showProperties();	
						break;					
				}

			}catch(InputMismatchException e){ 
				System.out.printf("Invalid action. Program closed.\n");
			}				
		}while(action != 0);
	}
}