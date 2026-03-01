import java.util.Scanner;

public class Feb25loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // // 1. a → z
        System.out.println("\na → z");
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch + " ");
        }

        // // 2. z → a
        System.out.println("\nz → a");
        for(char ch = 'z'; ch >= 'a'; ch--){
            System.out.print(ch + " ");
        }

        // 3. Aa → Zz
       
        for(char ch1 = 'A' ,  ch2 = 'a'; ch1 <= 'Z'; ch1++ , ch2++){
            System.out.println(ch1 + " " + ch2);
        }

        // // 4. Az → Za
        for(char ch1 = 'A' ,  ch2 = 'z'; ch1 <= 'Z'; ch1++ , ch2--){
            System.out.println(ch1 + " " + ch2);
        }

        // // 5. A -65 to Z- 90
        for(char ch1 = 'A' ,  ch2 = 65; ch1 <= 'Z'; ch1++ , ch2++){
            System.out.println(ch1 + " " + (int)ch2);
        }

        // // 6. a -65 to z- 90
         for(char ch1 = 'a' ,  ch2 = 65; ch1 <= 'z'; ch1++ , ch2++){
            System.out.println(ch1 + " " + (int)ch2);
        }

        // // 7. 0 → 48 to 9 - 57
      for(char ch1 = '0' ,  ch2 = 48; ch1 <= '9'; ch1++ , ch2++){
            System.out.println(ch1 + " " + (int)ch2);
        }

        // // 8. 1 → 100
       
        for(int i = 1; i <= 100; i++){
            System.out.print(i + " ");
        }

        // // 9. 100 → 50
        
        for(int i = 100; i >= 50; i--){
            System.out.print(i + " ");
        }

        // // 10. Odd Numbers
       
        for(int i = 100; i >= 1; i--){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }

        // 11. Even Numbers
        
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        // // 12. A C F J O U
        int dis = 1;
       for(char ch = 'A' ; ch <= 'Z';  ch+=++dis){

            System.out.print(ch + " ");
       
       }

        // 13. User Input Start & End
        System.out.print("Enter Start Number:");
        int start = sc.nextInt();

        System.out.print("Enter End Number:");
        int end = sc.nextInt();

        if(start >= end){
            System.out.println("INVALID");
            
        }
      
        System.out.println("Numbers from Start to End:");
        for(int i = start; i <= end; i++){
            System.out.print(i + " ");
        }

        // 14. Vowel & Consonant
        
        for(char ch = 'A'; ch <= 'Z'; ch++){
          switch(ch){
            case 'A', 'E', 'I', 'O', 'U': System.out.println( ch + " It is Vowels");
            // break;
            default: System.out.println( ch + " This is Consonent");
          }
        }

        // Using the Switch expression
        for(char ch = 'A'; ch <= 'Z'; ch++){

            String result = switch(ch){
            case 'A', 'E', 'I', 'O', 'U' -> "It is Vowel";
            default -> "It is Consonant";
         };

             System.out.println(ch + " : " + result);
}

       
    }
}