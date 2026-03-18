import java.util.Scanner;
class RangeNeon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number:");
        int start = sc.nextInt();
        System.out.println("Enter the end number:");
        int end = sc.nextInt();
        while(start <= end){
            int sq = start * start;
            int ld =0;
            for(int i = sq; i > 0; i/=10){
                ld += i % 10 ;
            }
            if(ld==start){
                System.out.print(start+" ");
            }
            start++;
        }
    }
}