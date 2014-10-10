/*
 Jake Sylvestre
 Intro to Java
 Mrs. Parziale
 Program 2.8 
 */
import java.util.*;
import java.lang.Math;
public class Prog28
{
	public static void main(String[] args)
   	{
   		double number, x1, y1, x2, y2, prim, prim2, primadd, fin;
   		Scanner input = new Scanner(System.in);
   		Scanner stringy = new Scanner (System.in);
   		String name;
   		
   		System.out.println ("Please enter the values for your first coordinate");
   		System.out.println (" ");
   		// Let's collect some values
   		System.out.println ("enter your first x coordinate: ");
   		x1 = input.nextDouble();//point one of x
   		
   		System.out.println ("Thank you, Please enter your y coordinate: ");
   		y1 = input.nextDouble();//point 2 of x
   		
   		System.out.println (" ");
   		System.out.println (" ");
   		System.out.println ("You will now enter your values for your second coordinate :");
   		System.out.println (" ");
   		
   		System.out.println (" Please enter your x coordinate");
   		x2 = input.nextDouble();// you get the point by now
   		
   		
   		System.out.println (" Please eneter your y coordinate");
   		y2 = input.nextDouble();
   		
   		System. out.println ("Thanks ");
   		System.out.print ("Computing");
   		System.out.print (".");
   		System.out.print (".");
   		System.out.print (".");
   		
   		prim = ((x2-x1)*(x2-x1));
   		prim2 = ((y2-y1)*(y2-y1));
   		primadd = (prim + prim2);
   		fin = Math.sqrt (primadd);
   		
   		System.out.println (" ");
   		System.out.println ("The distance between two points is " + fin);
   		
   	}
}
/*
Expected output: 0.28284271247461895

Please enter the values for your first coordinate
 
enter your first x coordinate: 
1.2
Thank you, Please enter your y coordinate: 
1.3
 
 
You will now enter your values for your second coordinate :
 
 Please enter your x coordinate
1.4
 Please eneter your y coordinate
1.5
Thanks 
Computing...The distance between two points is 0.28284271247461895

*/

