import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        User u1 = new User("Mike", 1234, 3450.27);
        User u2 = new User("Alex", 4321, 2347.98);
        User u3 = new User("Chris", 1357, 1250.65);
        User u4 = new User("Andreea", 2468, 500.25);

        System.out.println("============================");
        System.out.println("=============ATM============");
        System.out.println("============================");
        System.out.println();

        System.out.print("Enter PIN:");
        int value = input.nextInt();

        switch (value){
            case 1234 -> u1.optionPrompt(u1.getName());
            case 4321 -> u2.optionPrompt(u2.getName());
            case 1357 -> u3.optionPrompt(u3.getName());
            case 2468 -> u3.optionPrompt(u4.getName());
        }
    }
}