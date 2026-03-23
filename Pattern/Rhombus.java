class Rhombus{
    public static void main(String[] args){
          System.out.println("Pattern 5: right tilted Rombus Pattern");
          int n= 8;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - i - 1; j++) {
                if (j < n - i - 1) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();

        }
    }
}



//   System.out.println("Pattern 5: left tilted Rombus Pattern");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n + i; j++) {
//                 if (j < i) {
//                     System.out.print("   ");
//                 } else {
//                     System.out.print("*  ");
//                 }
//             }
//             System.out.println();

//         }