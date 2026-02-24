import java.util.Scanner;
import java.util.ArrayList;

class Bank {
    static String name; // null
    static long contact; // 0
    static int pin; // 0
    static double balance; // 0.0
    static ArrayList<String> transactions = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        welcome:
        for (;;) {
            System.out.println("\n********* WELCOME *********");
            System.out.println("      LAXMI CHIT FUND \n");
            System.out.println("1. CREATE ACCOUNT");
            System.out.println("2. LOGIN ");
            System.out.print("\n Enter your response : ");
            
            int opt = sc.nextInt();
            
            switch (opt) {
                case 1: {
                    if (name != null) {
                        System.out.println("\n YOUR ACCOUNT ALREADY EXISTS\n");
                        continue welcome;
                    }
                    
                    System.out.println("\n **** ACCOUNT CREATION PAGE **** \n");
                    System.out.print("Name : ");
                    sc.nextLine(); // Clear buffer
                    name = sc.nextLine();
                    
                    System.out.print("Contact : ");
                    contact = sc.nextLong();
                    
                    System.out.print("Pin : ");
                    pin = sc.nextInt();
                    
                    System.out.print("Amount : ");
                    balance = sc.nextDouble();
                    
                    transactions.add("Deposit : " + balance);
                    System.out.println("\n ACCOUNT CREATED SUCCESSFULLY \n");
                    break;
                }
                
                case 2: {
                    if (name == null) {
                        System.out.println("\n CREATE YOUR ACCOUNT FIRST\n ");
                        continue welcome;
                    }
                    
                    System.out.println("\n**** LOGIN MODULE *****\n");
                    System.out.print("Contact : ");
                    long userContact = sc.nextLong();
                    System.out.print("Pin : ");
                    int userPin = sc.nextInt();

                    if (userContact == contact && userPin == pin) {
                        System.out.println("\n**** LOGIN SUCCESSFULLY *** \n");
                        
                        loginLoop:
                        for (;;) {
                            System.out.println("\n **** FEATURES ****\n");
                            System.out.println("1. Deposit");
                            System.out.println("2. Withdraw");
                            System.out.println("3. Check Balance");
                            System.out.println("4. Transactions");
                            System.out.println("5. Logout");
                            System.out.print("\n Enter your opt : ");
                            int opt1 = sc.nextInt();

                            switch (opt1) {
                                case 1: {
                                    System.out.println("\n *** DEPOSIT MODULE *** \n");
                                    System.out.print("Enter an amount : ");
                                    double depositAmt = sc.nextDouble();
                                    balance += depositAmt;
                                    transactions.add("Deposit : " + depositAmt);
                                    System.out.println("\n AMOUNT CREDITED SUCCESSFULLY\n");
                                    break;
                                }
                                case 2: {
                                    System.out.println("\n *** Withdraw MODULE *** \n");
                                    System.out.print("Enter an amount : ");
                                    double wtdAmt = sc.nextDouble();
                                    System.out.print("Enter pin : ");
                                    int userPin1 = sc.nextInt();
                                    
                                    if (userPin1 == pin) {
                                        if (wtdAmt <= balance) {
                                            balance -= wtdAmt;
                                            transactions.add("Withdraw : " + wtdAmt);
                                            System.out.println("\n AMOUNT DEBITED SUCCESSFULLY\n");
                                        } else {
                                            System.out.println("\n INSUFFICIENT FUNDS\n");
                                        }
                                    } else {
                                        System.out.println("\n PIN INVALID \n");
                                    }
                                    break;
                                }
                                case 3: {
                                    System.out.println("\n *** Check Balance MODULE *** \n");
                                    System.out.print("Enter a pin : ");
                                    int userPin2 = sc.nextInt();
                                    if (userPin2 == pin) {
                                        System.out.println("\n Your account balance is " + balance + " rs.\n");
                                    } else {
                                        System.out.println("\n INVALID PIN\n");
                                    }
                                    break;
                                }
                                case 4: {
                                    System.out.println("\n *** Transactions MODULE *** \n");
                                    for (String ele : transactions) {
                                        System.out.println(ele); //
                                    }
                                    System.out.println("\n Account Balance : " + balance + "\n"); //
                                    break;
                                }
                                case 5: {
                                    System.out.println("\n THANK U & VISIT AGAIN \n"); //
                                    continue welcome; //
                                }
                                default: {
                                    System.out.println("\n INVALID RESPONSE \n"); //
                                    break;
                                }
                            }
                        }
                    } else {
                        System.out.println("\n INVALID CRED \n"); //
                    }
                    break; //
                }
                default: {
                    System.out.println("\n INVALID RESPONSE \n"); //
                    break;
                }
            }
        }
    }
}