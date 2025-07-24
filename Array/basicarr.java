package Array;

public class basicarr {
    public static void array1(int marks[],int changr){
            changr=17;
        for(int i=0; i<marks.length; i++){
        marks[i]=marks[i]+1;
     
        }
    }
    public static void main(String[] args) {
        int marks[]={55,44,66};
        int changr=56;
        array1(marks,changr);
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
           
        }
         System.out.println(changr);
    }
}
