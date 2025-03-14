import java.util.*;
public class hod {
void add(int a, int b) {
        System.out.println("Answer is: " + (a + b)); 
    }
     void add(int a, int b, int c) {
        System.out.println("Answer is: " + (a + b + c)); 
    }
    public static void main(String args[]) {
        Method obj = new Method(); 
        
        
        obj.add(5, 10); 
        obj.add(5, 10, 15); 
}
}