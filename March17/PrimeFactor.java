import java.util.Scanner;
class PrimeFactor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number:");
        int start = sc.nextInt();
        System.out.println("Enter the end number:");
        int end = sc.nextInt();
        while(start <= end){
            int num = start;
            System.out.print("Factors of " + start + " : ");
            for(int i = 2; i <= num ; i++){
                if(num % i == 0){
                    System.out.print(i + " ");
                    num = num /i;
                }
                
            }
            System.out.println();
             start++;
        }
       
    }
}