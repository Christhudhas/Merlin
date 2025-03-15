import java.util.*;
public class pr{
public static void main(String args[])
{ 
    System.out.println("number:");
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    if(num<=1) 
    {
       System.out.println("Not a prime number");
    } 
    else 
    {
        boolean isPrime = true;
    } 
    final boolean isPrime =extracted();
        if (isPrime) 
   {
    System.out.println(num + " is a prime number");
   } 
   else
   {
   System.out.println(num + " is not a prime number");
   }
 }

private static boolean extracted() {
    return true;
}
}
