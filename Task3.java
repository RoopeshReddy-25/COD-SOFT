import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== TEMPERATURE CONVERTER =====");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            double temp, result;
            switch (choice) {
                case 1:
                    System.out.print("Enter Celsius: ");
                    temp = sc.nextDouble();
                    result = (temp * 9 / 5) + 32;
                    System.out.println("Fahrenheit = " + result);
                    break;
                case 2:
                    System.out.print("Enter Fahrenheit: ");
                    temp = sc.nextDouble();
                    result = (temp - 32) * 5 / 9;
                    System.out.println("Celsius = " + result);
                    break;
                case 3:
                    System.out.print("Enter Celsius: ");
                    temp = sc.nextDouble();
                    result = temp + 273.15;
                    System.out.println("Kelvin = " + result);
                    break;
                case 4:
                    System.out.print("Enter Kelvin: ");
                    temp = sc.nextDouble();
                    result = temp - 273.15;
                    System.out.println("Celsius = " + result);
                    break;
                case 5:
                    System.out.print("Enter Fahrenheit: ");
                    temp = sc.nextDouble();
                    result = (temp - 32) * 5 / 9 + 273.15;
                    System.out.println("Kelvin = " + result);
                    break;
                case 6:
                    System.out.print("Enter Kelvin: ");
                    temp = sc.nextDouble();
                    result = (temp - 273.15) * 9 / 5 + 32;
                    System.out.println("Fahrenheit = " + result);
                    break;
                case 0:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
