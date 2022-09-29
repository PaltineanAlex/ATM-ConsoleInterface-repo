
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
        System.out.println("4. Exit account");
    }
}
