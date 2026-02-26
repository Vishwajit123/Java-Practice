import java.util.Scanner;
class Feb26{
    public static void main(String [] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String;");
        String str = sc.nextLine();

        System.out.println();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            System.out.print(ch);
            Thread.sleep(2000);
        }
        System.out.println();
    }
}