import java.util.*;
class PrimeRange{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number:");
        int start = sc.nextInt();
        System.out.println("Enter the end number:");
        int end = sc.nextInt();
        while(start <= end){
              if (start < 2) {  
                start++;
                continue;
            }
          int den = 2;
          while(den <= start/2){
            if(start % den == 0){
                break;
            }
            den++;
          }
          if(den > start/2){
            System.out.print(start+" ");
          }
          start++;
        }
       
    }
}