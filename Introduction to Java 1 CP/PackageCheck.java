/*
 * Jake Sylvestre
 * Mrs. Parziale
 * Introduction to Java CP
 * Prompts a customer for package wieght, checks it and tells them wether or not it is too heavy 
 * 11/6/2013
 */
import java.util.Scanner;//Needed for prompting the customer for weight,length,width,etc.
public class PackageCheck //Intalizing
{
public static void main (String[] args)
{
	boolean heavy=false, large=false;
	int kg, l, w, h, cubicm/*cubic centimeters*/;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter the package weight in kilograms: ");
	kg = input.nextInt();
	if (kg<0) 
	{	System.out.println("Please enter a weight greater than zero");}
	
	System.out.println("Thank you, Please enter the package length in centimeters:");
	l = input.nextInt();
	if (l<0)
	{ System.out.println ("Please enter a length greater than zero");}
	
	
	System.out.println("Next, enter the width in centemeters: ");
    w = input.nextInt();
    if (w<0) {System.out.println("Please enter a width greater than zero");}
	
	
	System.out.println("Finally, enter the package height in centemeters: ");
	h = input.nextInt();
	if (h<0) {System.out.println("Please enter a height greater than zero");}	
	
	cubicm = l*w*h;
	
	if (h<27)
		heavy = true;
	else 
		{ heavy=false;}
	if (cubicm < 100000)
		large=true;
	else 
		large = false;
			
	if ((large=true)&&(heavy=true))
		System.out.println ("Too heavy and to large");
	else if (large=true)
		{System.out.println("Too large");}
	else if (heavy=true)
	{System.out.println("Too heavy");}
	
	
	
	

	
	
}
}
