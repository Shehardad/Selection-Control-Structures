import java.util.Scanner;
public class L4T5{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter 1st integer: "); 
int a = sc.nextInt();
System.out.print("Enter 2nd integer: "); 
int b = sc.nextInt();
System.out.print("Enter 3rd integer: "); 
int c = sc.nextInt();
if(a == b && b == c)
{
  System.out.println("3");
}
else if(a == b && b != c)
{
  System.out.println("2");
}
else if(a != b && b == c)
{
  System.out.println("2");
}
else if(a == c && b != a)
{
  System.out.println("2");
}
else if( a != b && b != c && a != c )
{
  System.out.println("0");
}


sc.close();
}
}