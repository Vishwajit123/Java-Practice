import java.util.Scanner;

public class Population {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current population: ");
        long currentPopulation = sc.nextLong();

        long secondsPerYear = 365L * 24 * 60 * 60;

        long birthsPerYear = secondsPerYear / 7;
        long deathsPerYear = secondsPerYear / 13;
        long immigrantsPerYear = secondsPerYear / 45;

        long annualChange = birthsPerYear - deathsPerYear + immigrantsPerYear;

        System.out.println("\nAnnual Population Change: " + annualChange);

        System.out.println("\nPopulation for next 5 years:");

        for(int i = 1; i <= 5; i++) {
            currentPopulation += annualChange;
            System.out.println("Year " + i + " Population: " + currentPopulation);
        }
            
        sc.close();
    }
}
