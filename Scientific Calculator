import java.util.Scanner;

public class ScientificCalculator {

    // Convert degrees to radians
    public static double toRadians(double degrees) {    
        return Math.toRadians(degrees);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== SCIENTIFIC CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power (x^y)");
            System.out.println("6. Square Root");
            System.out.println("7. Sine (sin)");
            System.out.println("8. Cosine (cos)");
            System.out.println("9. Tangent (tan)");
            System.out.println("10. Logarithm (base 10)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            double a, b;

            switch (choice) {

                case 1:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a + b));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a - b));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a * b));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    if (b != 0)
                        System.out.println("Result = " + (a / b));
                    else
                        System.out.println("Error: Division by zero!");
                    break;

                case 5:
                    System.out.print("Enter base and exponent: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + Math.pow(a, b));
                    break;

                case 6:
                    System.out.print("Enter number: ");
                    a = sc.nextDouble();
                    System.out.println("Result = " + Math.sqrt(a));
                    break;

                case 7:
                    System.out.print("Enter angle in degrees: ");
                    a = sc.nextDouble();
                    System.out.println("Result = " + Math.sin(toRadians(a)));
                    break;

                case 8:
                    System.out.print("Enter angle in degrees: ");
                    a = sc.nextDouble();
                    System.out.println("Result = " + Math.cos(toRadians(a)));
                    break;

                case 9:
                    System.out.print("Enter angle in degrees: ");
                    a = sc.nextDouble();
                    System.out.println("Result = " + Math.tan(toRadians(a)));
                    break;

                case 10:
                    System.out.print("Enter number: ");
                    a = sc.nextDouble();
                    if (a > 0)
                        System.out.println("Result = " + Math.log10(a));
                    else
                        System.out.println("Error: Invalid input!");
                    break;

                case 0:
                    System.out.println("Exiting calculator... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
