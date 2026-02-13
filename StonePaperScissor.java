import java.util.Scanner;

class StonePaperScissor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (;;) {

            System.out.println("\n ************** WELCOME ***************");
            System.out.println("        STONE-PAPER-SCISSOR \n");
            System.out.println(" 1. STONE \n 2. PAPER \n 3. SCISSOR \n 4. EXIT\n");

            System.out.println("Enter your response : ");
            int userResp = sc.nextInt();

            // Exit option
            if (userResp == 4) {
                System.out.println("\n THANK YOU FOR PLAYING \n");
                break;
            }

            if (userResp < 1 || userResp > 3) {
                System.out.println("\n INVALID RESPONSE \n");
                continue;
            }

            String user = " ";
            if (userResp == 1)
                user = "STONE";
            else if (userResp == 2)
                user = "PAPER";
            else
                user = "SCISSOR";


            // Bot response
            int botResp = (int)(Math.random() * 3) + 1;

            String bot = " ";
            if (botResp == 1)
                bot = "STONE";
            else if (botResp == 2)
                bot = "PAPER";
            else
                bot = "SCISSOR";


            System.out.println(" ");
            System.out.println("          BOT         USER");
            System.out.println("         " + bot + "      " + user);


            // Winner calculation
            if (bot.equals("STONE") && user.equals("PAPER") ||
                bot.equals("PAPER") && user.equals("SCISSOR") ||
                bot.equals("SCISSOR") && user.equals("STONE")) {

                System.out.println("\n   *****  USER WON  ***********\n");

            }
            else if (bot.equals("STONE") && user.equals("SCISSOR") ||
                     bot.equals("PAPER") && user.equals("STONE") ||
                     bot.equals("SCISSOR") && user.equals("PAPER")) {

                System.out.println("\n   *****  BOT WON  ***********\n");

            }
            else {

                System.out.println("\n   *****  IT IS A DRAW  ***********\n");

            }
        }

      
    }
}
