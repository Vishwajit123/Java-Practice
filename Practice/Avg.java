import java.util.*;

class AverageSpeed {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        System.out.print("Enter time in minutes: ");
        double minutes = sc.nextDouble();

        System.out.print("Enter time in seconds: ");
        double seconds = sc.nextDouble();

        double miles = kilometers / 1.6;
        double timeInHours = (minutes + (seconds / 60)) / 60;
        double speed = miles / timeInHours;

        System.out.println("Average speed in miles per hour = " + speed);
    }
}


// Speed Formula = Distance / Time 