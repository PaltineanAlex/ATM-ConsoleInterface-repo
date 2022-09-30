import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean state = true;

        User u1 = new User("Mike", 1234, 3450.27);
        User u2 = new User("Alex", 4321, 2347.98);

        System.out.println("============================");
        System.out.println("============ATM=============");
        System.out.println("============================");
        System.out.println();

        System.out.print("Enter PIN:");
        int value = input.nextInt();

        switch (value) {
            case 1234 -> {
                do{
                    u1.optionPrompt(u1.getName());
                    int option = input.nextInt();
                    switch (option) {
                        case 1 -> u1.withdraw(u1.getBalance());
                        case 2 -> u1.deposit(u1.getBalance());
                        case 3 -> u1.checkBalance(u1.getBalance());
                    }
                    System.out.println("Do you want to do another transaction?(y/n)");
                    char answer = input.next().charAt(0);
                    if (answer == 'n') {
                        u2.exitAccount();
                        state = false;
                    }
                }while(state == true);
            }
            case 4321 -> {
                do {
                    u2.optionPrompt(u2.getName());
                    int option = input.nextInt();
                    switch (option) {
                        case 1 -> u2.withdraw(u2.getBalance());
                        case 2 -> u2.deposit(u2.getBalance());
                        case 3 -> u2.checkBalance(u2.getBalance());
                    }
                    System.out.println("Do you want to do another transaction?(y/n)");
                    char answer = input.next().charAt(0);
                    if (answer == 'n') {
                        u2.exitAccount();
                        state = false;
                    }
                }while(state == true);
            }
        }
    }
}