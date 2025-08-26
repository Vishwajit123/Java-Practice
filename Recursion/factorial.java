package Recursion;

public class factorial {

    public static int  printFact(int n){

        if(n==0){
           
            return 1;
        }
        
           int ff=n * printFact (n-1);
           return ff;
      
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(printFact(n));

    }
    
}
