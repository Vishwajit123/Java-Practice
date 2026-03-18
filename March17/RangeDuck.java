import java.util.Scanner;

class RangeDuck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start number:");
        int start = sc.nextInt();

        System.out.println("Enter the end number:");
        int end = sc.nextInt();

        while (start <= end) {
            int temp = start;

            while (temp > 0) {
                if (temp % 10 == 0) {
                    System.out.println(temp);
                }
                temp /= 10;
            }

            start++;
        }
    }
}