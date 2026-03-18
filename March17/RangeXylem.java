import java.util.Scanner;

class RangeXylem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start number:");
        int start = sc.nextInt();

        System.out.println("Enter the end number:");
        int end = sc.nextInt();

        while (start <= end) {
            int n = start;

            int last = n % 10;   
            int sumMid = 0;

            n /= 10; 

            while (n > 9) {
                sumMid += n % 10;
                n /= 10;
            }

            int first = n;  
            int sumEnd = first + last;

            if (sumEnd == sumMid) {
                System.out.print(start + " ");
            }

            start++;
        }
    }
}