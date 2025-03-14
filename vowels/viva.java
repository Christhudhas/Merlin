import java.util.Scanner;

public class viva
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String[] v = {"a", "e", "i", "o", "u"};  
        String merlin = scan.nextLine().toLowerCase(); 
        boolean detect = false;  
        for (int i = 0; i < v.length; i++)
        {
            if (merlin.equals(v[i]))  
                detect = true;
                break;  
        }
        if (detect) {
            System.out.println("vowels");
        } else {
            System.out.println("not");
        }
        scan.close();  
    }
}
