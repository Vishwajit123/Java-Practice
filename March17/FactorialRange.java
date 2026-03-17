import java.util.Scanner;
class FactorialRange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number:");
        int start = sc.nextInt();
        System.out.println("Enter the end number:");
        int end = sc.nextInt();
        while(start <= end){
            int fact = 1;
            for(int i = start; i > 1; i--){
                fact *= i;
            }
             System.out.println(start +" : "+fact);
             start++;
        }
       
    }
}