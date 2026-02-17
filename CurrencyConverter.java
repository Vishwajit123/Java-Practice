import java.util.*;

class CurrencyConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n************ Welcome to Currency Converter ************");

        System.out.println("\nAvailable Currencies:");
        System.out.println("USD  EUR  GBP  JPY  AUD");
        System.out.println("CAD  SGD  AED  CNY  RUB  ZAR");

        System.out.print("\nEnter a currency: ");
        String currency = sc.next().toUpperCase();

        System.out.print("Enter the amount (INR): ");
        double userCurr = sc.nextDouble();

        double curr = 0;

        if(currency.equals("USD")) {
            curr = userCurr / 90.82;
        }
        else if(currency.equals("EUR")) {
            curr = userCurr / 98.45;
        }
        else if(currency.equals("GBP")) {
            curr = userCurr / 115.67;
        }
        else if(currency.equals("JPY")) {
            curr = userCurr / 0.60;
        }
        else if(currency.equals("AUD")) {
            curr = userCurr / 60.12;
        }
        else if(currency.equals("CAD")) {
            curr = userCurr / 66.45;
        }
        else if(currency.equals("SGD")) {
            curr = userCurr / 67.89;
        }
        else if(currency.equals("AED")) {
            curr = userCurr / 24.73;
        }
        else if(currency.equals("CNY")) {
            curr = userCurr / 12.54;
        }
        else if(currency.equals("RUB")) {
            curr = userCurr / 1.02;
        }
        else if(currency.equals("ZAR")) {
            curr = userCurr / 4.80;
        }
        else {
            System.out.println("Invalid Currency Entered");
            return;
        }

        System.out.println("\nConverted Amount = " + curr + " " + currency);
    }
}
