import java.util.*;
public class arraylist{
    public static void main(String [] args){
        ArrayList<String> list=new ArrayList<String>();
        list.add("abc");
        list.add("pqr");
        list.add("xyz");
        list.add(0, "pst");
        System.out.println(list.get(1));
        
        System.out.println(list);
        list.set(1,"ght");
        System.out.println(list);
    }
}