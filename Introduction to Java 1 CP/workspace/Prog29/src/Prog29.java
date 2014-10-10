import java.util.Scanner; 

public class Prog29 
{ 
public static void main(String argv[]) 
{ 

Scanner input = new Scanner( System.in ); 
System.out.print( "Please enter the radius of sphere: " ); 
double radius = input.nextDouble(); 
System.out.println("Sphere volume is : " + ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 )); 
System.out.println("Sphere Surface Area is : " + 4.0 * Math.PI * Math.pow( radius, 3 )); 

} 
}
/* 
expected output:
sphere - 4.188 
Sphere surface areea- 12.566

Please enter the radius of sphere: 
1
Sphere volume is : 4.1887902047863905
Sphere Surface Area is : 12.566370614359172
*/