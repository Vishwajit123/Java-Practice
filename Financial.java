import java.util.Scanner;
class Financial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Subtotal :");
        float st = sc.nextFloat();
        System.out.println("Enter the tip rate :");
        float tr = sc.nextFloat();

        float tip = (st * tr) / 100;
        float total = st + tip ;

        System.out.println("The tip is " + tip + " and Total is " + total);
    }
}