/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 10 / tehtävä 2
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */
import java.util.*;

class Task
{
	private static Scanner s = new Scanner(System.in);
	private static String desc;
	
	// Kysytään ja asetetaan uuden tehtävän kuvaus
	public void setNew()
	{
		System.out.print("Syötä tehtävän kuvaus: ");
		this.desc = s.nextLine();
	}
	
	// Palautetaan ko. tehtävän kuvaus
	public String getDesc()
	{
		return this.desc;
	}	
}

public class miniprojekti10_2
{
	// Jono muutetaan taulukoksi ja loopataan se läpi tulostaen jokainen alkio
	private static void dumpQueue(Queue q)
	{
		Object[] dump = q.toArray();
		
		for (int i = 0; i < dump.length; i++){
			System.out.println(i + ": " + dump[i]);
		}
	}
	
	// Jono muutetaan taulukoksi ja tulostetaan käyttäjän haluamaa indeksiä vastaavan tehtävän kuvaus
	private static void showQueueItem(Queue q, int idx)
	{
		Object[] tasks = q.toArray();	
		System.out.println(idx + ": " + tasks[idx]);
	}
		
	public static void main(String[] args)
	{
		Queue<Object> q = new LinkedList<Object>();
		
		Task task  = new Task();
		Scanner s  = new Scanner(System.in);
		int action = 0;		
		
		// Pyöritellään ohjelmaa kunnes käyttäjä syöttää 0
		do {
			try{
				System.out.println("1: Syötä uusi tehtävä \n2: Tulosta tietty tehtävä \n3: Tulosta kaikki tehtävät");		
				action = s.nextInt();
				int max = q.size()-1;
				
				switch (action){
					case 0: 
						break;
					case 1: 
						task.setNew();
						q.add(task.getDesc());
						break;
					case 2:
						System.out.print("Syötä jonossa olevan tehtävän indeksi (0-" + max + "): ");	
						showQueueItem(q, s.nextInt());
						break;
					case 3: 
						dumpQueue(q);
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