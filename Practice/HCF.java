import java.util.Scanner;
class HCF{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number n1 :");
        int n1 = sc.nextInt();

        System.out.println("Enter the number n2 :");
        int n2 = sc.nextInt();

        int small = n1 < n2 ? n1 : n2;

        while(small > 0){
            if(n1 % small == 0 && n2 % small == 0){
                System.out.println("The HCF is " + small);
                break;
            }
            small--;
        }
    }
}