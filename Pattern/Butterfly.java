public class Butterfly {

    public static void main(String[] args) {
        int n = 11;
        System.out.println("Pattern 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j && i + j <= n - 1 || i >= j && i + j >= n - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
    }
}    



    // System.out.println("Pattern 2: Butterfly Pattern");
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (i >= j && i + j <= n - 1 || i <= j && i + j >= n - 1) {
    //                 System.out.print("*  ");
    //             } else {
    //                 System.out.print("   ");
    //             }
    //         }
    //         System.out.println();

    //     }  




    //  System.out.println("Pattern 3: Half Butterfly Pattern");
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (i >= j && i + j <= n - 1) {
    //                 System.out.print("*  ");
    //             } else {
    //                 System.out.print("   ");
    //             }
    //         }
    //         System.out.println();

    //     }
