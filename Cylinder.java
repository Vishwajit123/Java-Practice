import java.util.*;

class Cylinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius:");
        double r = sc.nextDouble();

        System.out.println("Enter the height:");
        double h = sc.nextDouble();

        double area = 2 * Math.PI * r * (r + h);
        double volume = Math.PI * r * r * h;

        System.out.println("Surface Area = " + area + " and Volume = " + volume);
    }
}
