import java.util.Scanner;
class RangeAutomorphic{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start :");
        int start = sc.nextInt();
        System.out.println("Enter the end :");
        int end = sc.nextInt();
       while(start <= end){ 
        int power = 1;
        for(int  i = start; i > 0; i/=10){
            power*= 10;
        }
         int sq = start * start;
         int ld = sq % power;

         if(ld== start){
             System.out.println(start);
         }
       
        start++;

    }
}
}