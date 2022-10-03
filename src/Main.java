import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean state = true;

        User u1 = new User("Mike", 1234, 3450.27);
        User u2 = new User("Alex", 4321, 2347.98);

        System.out.println("""
        ============================
        ============ATM=============
        ============================""");
        System.out.println();

        try (FileReader fr = new FileReader("data.txt")) {
            Scanner in = new Scanner(fr);
            while (in.hasNext()) {
                var items = in.nextLine().split("\t");
                if (items[0].equals(u1.getName())) {
                    u1.setBalance(Double.parseDouble(items[1]));
                }if(items[0].equals(u2.getName())){
                    u2.setBalance(Double.parseDouble(items[1]));
                }
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }

        System.out.print("Enter PIN:");
        int value = input.nextInt();

        switch (value) {
            case 1234 -> {
                do {
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
                } while (state);
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
                } while (state);
            }
        }
        try (FileWriter fw = new FileWriter("data.txt")) {
            fw.write(String.format("%s\t%.2f%n", u1.getName(), u1.getBalance()));
            fw.write(String.format("%s\t%.2f%n", u2.getName(), u2.getBalance()));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}