import java.util.Scanner;

class NStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        int count = 0;
        int start = 1;   

        while (count < n) {   
            int num = start;
            int sum = 0;

            for (int i = num; i > 0; i /= 10) {
                int ld = i % 10;

                int fact = 1;
                for (int j = ld; j > 1; j--) {
                    fact *= j;
                }

                sum += fact;
            }

            if (sum == start) {
                count++;

              
            }

            start++;
        }
                System.out.println(n + "th Strong Number is: " + (start - 1));

    }
}