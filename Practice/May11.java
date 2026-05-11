import java.util.Scanner;

class May11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int max1 = 0;
        int max2 = 0;

        while (n > 0) {

            int ld = n % 10;

            if (ld > max1) {
                max2 = max1;
                max1 = ld;
            }
            else if (ld > max2) {
                max2 = ld;
            }

            n /= 10;
        }

        int ans = max1 * max2;

        System.out.println("Maximum Product: " + ans);
    }
}