 package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Classroom {

    public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(77);
        list.add(5);

        System.out.println(list);
        // int element=list.get(0);
        // System.out.println(element);

        // list.remove(3);
        // System.out.println(list);

        // list.set(2, 43);
        // System.out.println(list);

        // System.out.println(list.contains(3));
        // System.out.println(list.contains(44));

        // System.out.println(list.size());

        // for(int i=list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();  
        // int max=Integer.MIN_VALUE;

        // for(int i=0; i<list.size(); i++){

            // if(max<list.get(i)){
            //     max=list.get(i);
            // }
        //      max=Math.max(max, list.get(i));
        // }
        // System.out.println(max);  

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);


    }
}