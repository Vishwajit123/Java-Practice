import java.util.Scanner;
class Feb27{
    public static void main(String [] args){
        Scanner  sc = new Scanner(System.in);
        int esum = 0 ; 
        int osum = 0;
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        
        for(int i = num ; i > 0 ; i = i/10){
            int ld = i % 10;
            if(ld % 2 == 0) esum += ld;
            else osum += ld;
        }
        System.out.println("Even Sum = " + esum);
         System.out.println("odd sum = " + osum);
    }
}