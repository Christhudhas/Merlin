public class Method {
    
    public static void add(int num1, int num2) {
        int sum = num1 + num2; 
        System.out.println("Sum: " + sum);
    }

    public static void main(String args[])
    {
        Method m = new Method();
        m.add(10, 20); 
    }
}
