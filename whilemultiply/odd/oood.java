public class oood {
    public static void main(String[] args) {
        int start = 1;  
        int end = 20;   
        System.out.println("Odd numbers between " + start + " and " + end + ":");
        int num = start;
        while (num <= end) {
            if (num % 2 != 0) { 
                System.out.println(num);
            }
            num++;
        }
    }
}
