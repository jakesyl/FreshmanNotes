import java.util.Scanner;
public class Prog30
{
    static Scanner sc = new Scanner(System.in);
    public static void main ( String args[] )
    {
        System.out.print("Enter side 'a' of the triangle: ");
        int a = sc.nextInt();

        System.out.print("Enter side 'b' of the triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter side 'c' of the triangle: ");
        int c = sc.nextInt();
        int x =  (int)(( Math.random () * 9) + 1);
        double s = 0.5 * (a + b + c);
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.print(area);
    }
}
/*
sum = 62.3538 (sum)
Enter side 'a' of the triangle: 12
Enter side 'b' of the triangle: 12
Enter side 'c' of the triangle: 12
62.353829072479584

*/