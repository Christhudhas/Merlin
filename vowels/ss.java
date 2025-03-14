import java.util.Scanner;

public class ss
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Declare the array with 4 elements (A, B, C, D)
        String[] v = new String[4]; 

        // Input for the second element of the array (index 1)
        System.out.println("Enter a value for index 1:");
        v[1] = scan.nextLine();
        
        // Print the updated value in the array
        System.out.println("Value at index 1: " + v[1]);
    }
}
