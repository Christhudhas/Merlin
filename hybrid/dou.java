import java.util.*;
class parent
    { 
        public void add(){
         System.out.println("merlindhas");

    }
    class Child extends parent{
        void display()
        {
            add();

        }
        class third extends Child{
            void helper(){
                display();
            }
        }
    }
    public class dou{
        public static void main (String args[])
        {
            Child obj=new Child();
            obj.display();
        }
    }
    }