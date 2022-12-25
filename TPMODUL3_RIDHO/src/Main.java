import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        int customerID,orderQty;

        try {
            System.out.println("Enter Customer ID : ");
            customerID = scanner.nextInt();

            System.out.println("Enter how much food to made : ");
            orderQty = scanner.nextInt();

            Thread t1Thread = new Thread(restaurant);
            Waiters waiters = new Waiters(customerID,orderQty);
            Thread t2Thread = new Thread(waiters);
            
            t1Thread.start();
            t2Thread.start();
            t1Thread.join();
            t2Thread.join();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Input must be Integer");
        }
    }
}
