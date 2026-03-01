import java.util.Scanner;

// ----------------------------------------------------- reverse number ---------------------------
// class Feb28{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the num ");
//         int n = sc.nextInt();
//         int rev = 0;
//         for(int i = n; i > 0; i /= 10 ){
//             int ld = i % 10;
//             rev = rev *10 + ld;
//         }
//         System.out.println(rev);
//     }
// }
  
// ---------------------------------  Reverse String -------------------------------------

// class Feb28{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the String:");
//         String str = sc.next();
//         String rev ="";
//         for(int i =0 ; i < str.length(); i++){
//             char ch  = str.charAt(i);
//             rev = ch + rev;
//         }
//         System.out.println("reverse String " + rev);
//     }
// }  


// --------------------- Pallindrome String ---------------------------------------

// class Feb28{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String:");
//         String str = sc.next();
//         boolean assum = true;

//         for(int i = 0 , j = str.length()-1; i < str.length()/2; i++, j--){
//             if(str.charAt(i) != str.charAt(j)){
//                 assum = false;
//                 break;
//             }
//         }
//         if(assum){
//             System.out.println(str + " Pallindromic String");
//         }
//         else{
//             System.out.println(str +" not Pallindromic String");
//         }
        
//     }
// }


// -----------------------------------------  power of number --------------------------------------

import java.util.Scanner;

class Feb28{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double num = sc.nextDouble();

        System.out.print("power : ");
        double power = sc.nextDouble();

        if(power < 0){
            power *= -1;
            num = 1 / num;
        }

        double op = 1;

        for (int i = 1; i <= power; i++) {
            op = op * num;
        }

        System.out.println("\nMath.pow : " + Math.pow(num, power));
        System.out.println("User : " + op);
    }
}