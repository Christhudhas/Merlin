import java.util.*;
public class sod{
public static void main(String args[])
{
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a number:");
    int num=scan.nextInt();
    int sum=0;
    while(num!=0)
    {
       int digit =num % 10;
       sum+=digit;
       num/=10;
    }
    System.out.println("num:"+sum);
    scan.close();
}
}