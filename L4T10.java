import java.util.Scanner;
public class L4T10{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of books purchased this month: ");
int b = sc.nextInt();

if(b == 0)
{
  System.out.println("You earned 0 points.");
}
else if(b == 1)
{
  System.out.println("You earned 5 points.");
}

else if(b == 2)
{
  System.out.println("You earned 15 points.");
}
else if(b == 3)
{
  System.out.println("You earned 30 points.");
}
else if(b >= 4)
{
  System.out.println("You earned 60 points.");
}
sc.close();
}
}