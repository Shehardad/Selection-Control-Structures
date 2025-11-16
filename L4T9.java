import java.util.Scanner;
public class L4T9{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter the number of pennies: ");
double p = sc.nextDouble();
System.out.print("Enter the number of nickels: ");
double n = sc.nextDouble();
System.out.print("Enter the number of dimes: ");
double d = sc.nextDouble();
System.out.print("Enter the number of quarters: ");
double q = sc.nextDouble();

double dollar = p / 100 + n / 20 + d / 10 + q / 4;
System.out.println(dollar);

if(dollar == 1)
{
  System.out.println("Congratulations!");
}
else if(dollar > 1)
{
  System.out.println("More than a dollar.");
}
else if(dollar < 1)
{
  System.out.println("Less than a dollar.");
}
sc.close();
}
}
