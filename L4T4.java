import java.util.Scanner;
public class L4T4{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println(" For a part" );
System.out.print("Enter 1st integer: "); 
int x = sc.nextInt();
System.out.print("Enter 2nd integer: "); 
int y = sc.nextInt();
if(x < y)
{
  System.out.println(x + " is smaller "); 
}
else
{
  System.out.println(y + " is smaller "); 
}

System.out.println(" For b part" );

System.out.print("Enter 1st integer: "); 
int z = sc.nextInt();
System.out.print("Enter 2nd integer: "); 
int w = sc.nextInt();
if(z < w)
{
  System.out.println(z + " is smaller "); 
}
else
{
  System.out.println(w + " is smaller "); 
}

System.out.println(" For c part" );

if(x > 0)
{
   System.out.println("1");
}
else if(x < 0)
{
   System.out.println("-1");
}
else if(x == 0)
{
   System.out.println("0");
}

System.out.println(" For d part" );
System.out.print("Enter 1st integer: "); 
int a = sc.nextInt();
System.out.print("Enter 2nd integer: "); 
int b = sc.nextInt();
System.out.print("Enter 3rd integer: "); 
int c = sc.nextInt();

if(a < b && a < c)
{
 System.out.println( a + " is the smallest number." );
}
else if(b < a && b < c)
{
 System.out.println( b + " is the smallest number." );
}
else
{
System.out.println( c + " is the smallest number." );
}

sc.close();
}
}
