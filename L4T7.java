import java.util.Scanner;
public class L4T7{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the length of Rectangle 1 :");
double length1 = sc.nextDouble();
System.out.print("Enter the width of Rectangle 1 :");
double width1 = sc.nextDouble();
double area1 = length1 * width1;

System.out.print("Enter the length of Rectangle 2 :");
double length2 = sc.nextDouble();
System.out.print("Enter the width of Rectangle 2 :");
double width2 = sc.nextDouble();
double area2 = length2 * width2;

if(area1 > area2)
{
System.out.print("Recangle 1 has greater area");
}
else if(area1 == area2)
{
System.out.print("Both rectangles are equal in area.");
}
else
{
System.out.print("Recangle 2 has greater area");
}
sc.close();
}
}

