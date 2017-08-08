/**
 * Java-ohjelmointi 5 op LUD2025 (kesä 2017)
 * Miniprojekti 4 / tehtävä 2
 * @author Jani Suista
 * @email jani.suista@student.samk.fi
 */

import java.util.*;

public class miniprojekti4_2 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		double a, b, res = 0;
		
		// Kysytään ensimmäinen operandi ja tallentaan se muuttujaan a
		System.out.print("Enter first operand: ");
      	a = s.nextDouble();
		
		// Kysytään toinen operandi ja tallentaan se muuttujaan b
		System.out.print("Enter second operand: ");
      	b = s.nextDouble();
		
		// Kysytään minkä operaation käyttäjä haluaa operandeille suorittaa
		System.out.print("Select the operator (1 = add, 2 = subtract, 3 = multiply, 4 = divide): ");
      	int operator = s.nextInt();
		
		// Valitaan haluttu operaatio ja suoritetaan se muuttujilla a ja b
		switch (operator){
			case 1: res = a + b;
				break;
			case 2:	res = a - b;
				break;		
			case 3:	res = a * b;
				break;					
			case 4:	res = a / b;
				break;
			default:
				break;
		}
		
		System.out.printf("The result of the calculation is: %.1f\n", res);
	}
}