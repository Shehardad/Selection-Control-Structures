public class L4T1{
public static void main(String [] args){

int x = 10;
int y = 15;
int z = 20;

Boolean r1 = !(x > 10);
System.out.println( r1 );
Boolean r2 = x <= 5 || y < 15; 
System.out.println( r2 );
Boolean r3 = (x != 5) && (y != z);
System.out.println( r3 );
Boolean r4 = x >= z || (x + y >= z);
System.out.println( r4 );
Boolean r5 = (x <= y - 2) && (y >= z) || (z - 2 != 20);
System.out.println( r5 );
}
}