import java.util.Scanner;
public class L4T6{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number between 1 and 10: ");
int x = sc.nextInt();
if(x == 1)
{
  System.out.print("i");
}
else if(x == 2)
{
  System.out.print("ii");
}
else if(x == 3)
{
  System.out.print("iii");
}
else if(x == 4)
{
  System.out.print("iv");
}
else if(x == 5)
{
  System.out.print("v");
}
else if(x == 6)
{
  System.out.print("vi");
}

else if(x == 7)
{
  System.out.print("vii");
}

else if(x == 8)
{
  System.out.print("viii");
}
else if(x == 9)
{
  System.out.print("ix");
}
else if(x == 10)
{
  System.out.print("x");
}
else
{
  System.out.print("ERROR!");
}
sc.close();
}
}






