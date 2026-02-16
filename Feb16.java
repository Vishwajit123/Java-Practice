
// ******************************** UPPERCASE LOWERCASE DIGIT SPECIAL CHARACTER ********************************
// import java.util.Scanner;
// class Feb16 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         char ch = sc.next().charAt(0);

//         String output  =
//         (ch >= 65 && ch <=90 || ch >= 97 && ch <= 122 ) ?
//         ((ch >= 65 && ch <= 90) ?
//         (ch + " is it Upperrcase"):
//         (ch + " is it Lowercase")):
//         ((ch >= 48 && ch <= 57) ?
//         (ch + " it is Digit"):
//         (ch + " it is special character"));

//         System.out.println(output);
//     }
// }

// ********************************* Didit or Not ***********************************************

// import java.util.Scanner;
// class Feb16 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the character: ");
//         char ch = sc.next().charAt(0);

//         String output  =
        
//         (ch >= 48 && ch <= 57) ? (ch + " it is Digit") : (ch + " it is not digit");

//         System.out.println(output);
//     }
// }

// ************************************* Alphabet or not ******************************************

// import java.util.Scanner;
// class Feb16 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the character: ");
//         char ch = sc.next().charAt(0);

//         String output  =
        
//         (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) ? (ch + " it is Alphabet") : (ch + " it is not Alphabet");

//         System.out.println(output);
//     }
// }

// **********************************   Uppercase Lowercase or nothing ***************************

import java.util.Scanner;
class Feb16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        String output  =
        (ch >= 65 && ch <=90 || ch >= 97 && ch <= 122 ) ?
        ((ch >= 65 && ch <= 90) ?
        (ch + " is it Upperrcase"):
        (ch + " is it Lowercase")):
        ("it is Nothing");

        System.out.println(output);
    }
}