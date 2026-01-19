import java.util.Scanner;

public class RecursionFIB {
    
    public static int fib(int n){

        
        if( n <=1){
            return n;
        }
        else {
              return    fib(n-1)+fib(n-2);
            }
             
    }      
           
    public static void main(String[] args){

        
        //  int N=12;  

         Scanner scanner=new Scanner(System.in);
         System.out.print("Enter the number:");
         int N= scanner.nextInt();
            for(int i=0; i<N; i++){

                 System.out.println(fib(i));
            }
         
     
    }
}
