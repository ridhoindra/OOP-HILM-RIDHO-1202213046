import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        Calculation calculation = new Calculation();
        
        do {
            try {
              System.out.println("\n==Menu Program==");
              System.out.println("1. Square");
              System.out.println("2. Circle");
              System.out.println("3. Trapezoid");
              System.out.println("0. Exit");
              System.out.print("Select menu: ");
              int menu = scanner.nextInt();
      
              switch (menu) {
                case 1:
                  System.out.print("\nEnter the length of the side of the square : ");
                  double sisi = scanner.nextDouble();
                  calculation.setSquare(sisi);
                  calculation.run();
                  System.out.println("\nThe calculation result: " + calculation.getSquare());
                  break;
                case 2:
                  System.out.print("\nEnter the radius of the circle : ");
                  double radius = scanner.nextDouble();
                  calculation.setCircle(radius);
                  calculation.run();
                  System.out.println("\nThe calculation result: " + calculation.getCircle());
                  break;
                case 3:
                  System.out.print("\nEnter the upper side of the trapezoid : ");
                  double a = scanner.nextDouble();
                  System.out.print("Insert the side of the base of the trapezoid : ");
                  double b = scanner.nextDouble();
                  System.out.print("Enter the height of the trapezoid : ");
                  double t = scanner.nextDouble();
                  calculation.setTrapezoid(a, b, t);
                  calculation.run();
                  System.out.println("\nThe calculation result: " + calculation.getTrapezoid());
                  break;
                case 0:
                  System.out.println("\nProgram End");
                  break;
                default:
                  System.out.println("\nOption not available");
                  continue;
              }
              repeat = false;
            } catch (InputMismatchException e) {
              System.out.println("\n====Error: Input must be a number====");
              scanner.next();
            } catch (IllegalArgumentException e) {
              System.out.println(e.getMessage());
            }
          } while (repeat);
      
          scanner.close();
    }
}
