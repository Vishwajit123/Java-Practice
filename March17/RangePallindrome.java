import java.util.Scanner;

class RangePallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start number:");
        int start = sc.nextInt();

        System.out.println("Enter the end number:");
        int end = sc.nextInt();

        while (start <= end) {
            int temp = start;
            int n = start;
            int rev = 0;

            while (n > 0) {
                int ld = n % 10;
                rev = rev * 10 + ld;
                n /= 10;
            }

            if (temp == rev) {
                System.out.print(temp + " ");
            }

            start++;
        }
    }
}