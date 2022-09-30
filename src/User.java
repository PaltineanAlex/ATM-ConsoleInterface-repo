import java.util.Scanner;

public class User {
    private String name;
    private int PIN;
    private double balance;

    public User(String name, int PIN, double balance) {
        this.name = name;
        this.PIN = PIN;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void optionPrompt(String name){
        System.out.println("Hello "+ name + ", welcome to your account!");
        System.out.println("===================================================");
        System.out.println("Choose the number for the operation you want to do:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. CheckBalance");
    }

    public void exitAccount() {
        System.out.println("Please remove the card....");
        System.out.println("Have a good day!");
    }

    public void checkBalance(double currentValue) {
        System.out.println("Your current balance is: " + currentValue);
    }

    public void deposit(double currentBalance) {
        System.out.println("How much money do you want do deposit:");
        Scanner in = new Scanner(System.in);
        double valueAdded = in.nextInt();
        currentBalance += valueAdded;
        setBalance(currentBalance);
    }

    public void withdraw(double currentBalance) {
        System.out.println("How much money do you want to withdraw:");
        Scanner in = new Scanner(System.in);
        double valueWithdrawn = in.nextDouble();
        if(valueWithdrawn <= currentBalance){
            currentBalance -= valueWithdrawn;
            setBalance(currentBalance);
        }else{
            System.out.println("You don't have enough funds to withdraw the requested amount.");
        }
    }

    public void doAnotherTransaction(){
        System.out.println("Do you want to do another transaction?(y/n) ");
        Scanner in = new Scanner(System.in);
        char answer = in.next().charAt(0);
        boolean state = true;
        while(state == true){
            if(answer == 'y'){
                continue;
            }else if(answer == 'n'){
                exitAccount();
                state = false;
            }
        }
    }
}
