import java.util.Scanner;
public class L4T8{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a month in numeric form: ");
int m = sc.nextInt();
System.out.print("Enter a day: ");
int d = sc.nextInt();
System.out.print("Enter a two-digit year: ");
int y = sc.nextInt();
System.out.println( m + "/" + d + "/" + y);
if(y == m * d)
{
   System.out.println("The date is magic.");
}
else
{
   System.out.println("The date is not magic.");
}
sc.close();
}
}