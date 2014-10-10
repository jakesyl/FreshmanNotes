import java.util.Scanner;
public class Excercise16
{
public static void main (String[] args)
{
	Scanner input = new Scanner (System.in);
	int counter=1, total=0, grade=0, finaly=0;
	while(grade>-1)
		{
		System.out.println("Input grade " + counter + ": ");
		grade= input.nextInt();
		while (grade>100)
		{
		
			System.out.println("Please enter a valid grade less than 101 (negative to exit)");
			System.out.println("Input grade " + counter + ": ");
			grade= input.nextInt();
		}
		if (grade<0)
		{
			total= total-grade;
		}
		total = grade+total;
		counter= counter+1;
		}
finaly = total/counter;
System.out.println("The class average is " + finaly);
System.exit(0);
}
}
/*
				    
Tests:
	     
				     TESTS FOR EX 16
*********************************************************

Test 1:
Input grade 1: 
23
Input grade 2: 
234
Please enter a valid grade less than 101 (negative to exit)
Input grade 2: 
23
Input grade 3: 
123
Please enter a valid grade less than 101 (negative to exit)
Input grade 3: 
43
Input grade 4: 
12
Input grade 5: 
100
Input grade 6: 
94
Input grade 7: 
23
Input grade 8: 
234
Please enter a valid grade less than 101 (negative to exit)
Input grade 8: 
23
Input grade 9: 
43
Input grade 10: 
432
Please enter a valid grade less than 101 (negative to exit)
Input grade 10: 
23
Input grade 11: 
43
Input grade 12: 
64
Input grade 13: 
74
Input grade 14: 
-10000
The class average is 39

				     
				     TESTS FOR EX 15
*********************************************************

Input grade 1: 
89
Input grade 2: 
232
Please enter a valid grade between 1-100
Input grade 2: 
457
Please enter a valid grade between 1-100
Input grade 2: 
23
Input grade 3: 
123
Please enter a valid grade between 1-100
Input grade 3: 
324
Please enter a valid grade between 1-100
Input grade 3: 
12
Input grade 4: 
123
Please enter a valid grade between 1-100
Input grade 4: 
2
Input grade 5: 
34
Input grade 6: 
54
Input grade 7: 
23
Input grade 8: 
23
Input grade 9: 
43
Input grade 10: 
23
The class average is 29
				     
				     My Pseudocode
*********************************************************
import scanner
int counter  = 1, total=0, grade = 0;
while
prompt for a grade
enter
add to total 
counter+-
					Pseudocode/Directions
*********************************************************
A class of ten students took a quiz. The grades (integers in the range 0 Ğ 100) for this quiz 
are available to you. Write a program using a while loop that will determine the class 
average on the quiz. Use the following pseudocode: 
 Set total to zero 
 Set grade counter to one 
 
 While(grade counter is less than or equal to ten) 
 Input the next grade 
 Add the grade into the total 
 Add one to the grade counter 
 
 Set the class average to the total divided by ten 
 Print the class average. 
 
Your output should look similar to: 
 Enter integer grade: 100 
 Enter integer grade: 88 
 Enter integer grade: 93 
 . 
 . 
 . 
 Class average is 79. 

*/