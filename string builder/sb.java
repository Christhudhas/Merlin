public class sb {
    public String Concatenator(String name,String name1){
        String name2=name+" "+name1;
        return name2;
    }
    public static void main (String args[])
    {
        sb obj=new sb();
        String x=obj.Concatenator("Merlin","Christhu dhas");
        System.out.println(x);
    }
    
}
