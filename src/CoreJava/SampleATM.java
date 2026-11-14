package CoreJava;

import java.util.Scanner;

public class SampleATM {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int pin = 772629;
        int bal = 10000;
        String name = "Pranay Kotawar";

        System.out.println("Welcome Mr." + name);

        System.out.print("Enter your PIN: ");
        int enteredpin = Integer.parseInt(sc.nextLine());

        System.out.println("Checking Please wait....");
        Thread.sleep(1500);

        if(enteredpin == pin){
            System.out.println("1. Check Balance");
            System.out.println("2. Deposite money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit/Cancle");

            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Your Balance = " + bal);
                    break;

                case 2:
                    System.out.print("Enter amount to Deposite: ");
                    int deposite = sc.nextInt();
                    bal += deposite;
                    Thread.sleep(2000);
                    System.out.println("Updated Balance = " + bal);
                    System.out.println("");
                    System.out.println("Please visit again....");
                    break;

                case 3:
                    System.out.print("Enter anount to Withdrawl: ");
                    int withdrawl = sc.nextInt();
                    if (withdrawl <= bal) {
                        bal -= withdrawl;
                        Thread.sleep(2000);
                        System.out.println("Collect your cash...");
                        System.out.println("Remaining balance: " + bal);
                        System.out.println("");
                        System.out.println("Please visit again....");
                    }else{
                        System.out.println("Insufficient balance....");
                    }
                    break;

                case 4:
                    System.out.println("Exit...");
            }
        }else{
            Thread.sleep(2000);
            System.out.println("Incorrect PIN entered..Please try again....");
        }
        sc.close();
    }
}