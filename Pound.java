import java.util.*;

class PoundToKg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight in pounds:");
        double pound = sc.nextDouble();

        double kg = pound * 0.454;

        System.out.println(pound + " pounds = " + kg + " kilograms");
    }
}
