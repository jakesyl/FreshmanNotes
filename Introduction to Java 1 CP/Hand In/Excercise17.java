import java.util.Random;

public class Excercise17 
{
public static void main (String[] args)
{
	//intilazation
	int die1=0, die2=0, rc=0/*roll counter*/;
	Random dice= new Random();
	do
	{
		//die 1 intilization
		die1=dice.nextInt(/*random seed*/6);//randomizing
		die1=die1+1;//random starts at zero
		//die 2 intilization
		die2=dice.nextInt(6);
		die2=die2+1;
		rc= rc+1;
	}while (!((die1==1)&&(die2==1)));
	System.out.println("Snake Eyes in " + rc);
}
}


/*
 						Test
************************************************************ 
Snake Eyes in 37
Snake Eyes in 44
Snake Eyes in 71

					My PseudoCode
************************************************************
import random
stat void pub
intalize random
int die1=0, die2=0, rc=0;
do 
random die1 6+1
random die 2 6+1
roll counter +=;
while ((die1=1)&&(die2=2))
snake eyes
					Directions
************************************************************
How many times do you have to roll a pair of dice before they come up snake eyes? Write a 
computer program using a do-while loop that simulates the experiment. The program should 
report the number of rolls that it makes before the dice come up snake eyes. (Note: "Snake eyes" 
means that both dice show a value of 1.) 
 
Use the following pseudocode: 
 Set roll counter to 0 
 do 
 roll die one 
 roll die two 
 add one to roll counter 
 while (die one is not 1 or die two is not 1) 
 print out a message saying it took roll counter rolls to come up snake eyes. 
 
Your output should look similar to: 
 
 It took 8 rolls to come up snake eyes. 
 
A for loop may be used in place of a while loop by including the increment in the for 
condition
*/