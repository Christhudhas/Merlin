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
    public class hi{
        public static void main (String args[])
        {
            third obj=new third();
            obj.helper();
            Child obj1=new Child();
            obj1.display();
        }
    }
    }