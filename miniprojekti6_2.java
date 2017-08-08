/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 6 / tehtävä 2
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */
 
import java.util.*;

class Pelihahmo
{
	private String name;
	private int age;	
	private String sex;
	private Character character = new Character();
	private Weapon weapon = new Weapon();
	private Scanner s = new Scanner(System.in);
	
	public void showProperties()
	{
		System.out.printf("Name: %s\n", this.name);
		System.out.printf("Age: %s\n", this.age);
		System.out.printf("Sex: %s\n", this.sex);		
		
		character.showProperties();
		weapon.showProperties();
		
	}
	public void setProperties()
	{
		System.out.print("Character name: ");
		this.name = this.s.nextLine();
		
		System.out.print("Character age: ");
		this.age = this.s.nextInt();
		
		System.out.print("Character sex: ");		
		this.sex = this.s.nextLine();
		this.s.nextLine();
		
		character.setProperties();
		weapon.setProperties();
	}	
	
}

class Character
{
	private String type = "Warrior";
	private int level = 0;
	private String skills = "Ability to cut other players heads";

	public void setProperties()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Character type: " );
		this.type = s.nextLine();
		
		System.out.print("Character level: " );
		this.level = s.nextInt();
		s.nextLine();
		
		System.out.print("Character special skills: " );		
		this.skills = s.nextLine();
	}
	
	public void showProperties()
	{
		System.out.printf("Charcter type: %s\n", this.type);
		System.out.printf("Character level: %d\n", this.level);
		System.out.printf("Character special skills: %s\n", this.skills);
	}	
}

class Weapon
{
	private String type = "Sword";
	private int defaultdmg = 25;
	private int bonusdmg = 10;
	private Scanner sw = new Scanner(System.in);
	
	public void setProperties()
	{	
		System.out.print("Weapon type: " );
		this.type = sw.nextLine();
		
		System.out.print("Weapon default damage: " );
		this.defaultdmg = sw.nextInt();
		
		System.out.print("Weapon bonus damage: " );		
		this.bonusdmg = sw.nextInt();
	}
	
	public void showProperties()
	{
		System.out.printf("Weapon type: %s\n", this.type);
		System.out.printf("Weapon default damage: %d\n", this.defaultdmg);
		System.out.printf("Weapon bonus damage: %d\n", this.bonusdmg);
	}
}

public class miniprojekti6_2 
{
	public static void main(String[] args)
	{
		int action = 0;
		Scanner s = new Scanner(System.in);
		Pelihahmo Hahmo = new Pelihahmo();

		do {
			try{
				System.out.println("\nVALIKKO | valitse numeroa vastaava toiminto.\n");
				System.out.print("1: Muuta hahmon ominaisuuksia \n2: Näytä hahmon ominaisuudet \n0: Lopeta\n\n");
				action = s.nextInt();

				switch (action){
					case 0: break;
					case 1: Hahmo.setProperties();
						break;
					case 2: Hahmo.showProperties();
						break;
				} 
			}catch(InputMismatchException e){
				System.out.printf("Invalid action. Program closed.\n");
			}				
		}while(action != 0);
	}
}