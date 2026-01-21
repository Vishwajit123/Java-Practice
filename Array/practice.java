public class practice{
    public static void main(String []args){
        // int [] arr={2,4,56,77,88,89};

        // for(int num: arr){
        //     System.out.print(num+" ");
        // }
        String str="madat";
        String rev=" ";
        for(int i=str.length()-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev+" ");
    }
}