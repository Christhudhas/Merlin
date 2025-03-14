import java.util.*;
class parent
    { 
         void display(){
         System.out.println("merlindhas");

    }
}
    class Child extends parent{
        void display(){
        System.out.println("christhu");

        }
      
    }
    public class dou{
        public static void main (String args[])
        {
            Child obj=new Child();
            obj.display();
        }
    }