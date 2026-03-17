import java.util.Scanner;
class Factor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number:");
        int start = sc.nextInt();
        System.out.println("Enter the end number:");
        int end = sc.nextInt();
        while(start <= end){
            System.out.print("Factors of " + start + " : ");
            for(int i = 1; i <= start ; i++){
                if(start % i == 0){
                    System.out.print(i + " ");
                }
                
            }
            System.out.println();
             start++;
        }
       
    }
}