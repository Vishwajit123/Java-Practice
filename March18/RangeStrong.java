classimport java.util.Scanner;

class RangeStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start number:");
        int start = sc.nextInt();

        System.out.println("Enter the end number:");
        int end = sc.nextInt();

        while (start <= end) {
            int n = start;
            int sum = 0;

            for (int i = n; i > 0; i /= 10) {
                int ld = i % 10;

                int fact = 1;
                for (int j = ld; j > 1; j--) {
                    fact *= j;
                }

                sum += fact;
            }

            if (sum == start) {
                System.out.println(start + " is a Strong Number");
            }

            start++;
        }
    }
}