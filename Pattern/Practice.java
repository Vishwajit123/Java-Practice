import java.util.Scanner;
class Practice{
    public static void main(String[] main){
        int n=11;
        int space = n/2;
        int start=1;
        for(int i=0; i<n; i++){
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
                for(int j=0; j<start; j++){
                    System.out.print("*");
                }
                  System.out.println();
                
            if(i< n/2){
                
                space--;
                start+=2;
               
            }
            else{
                 space++;
                start-=2;
               
            }
           
            
          
        }
    }
}