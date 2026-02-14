import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2;
        num1 = readDouble(sc, "Enter the first number: ");
        num2 = readDouble(sc, "Enter the second number: ");

        System.out.println("Enter the operator (+, -, *, /):");
        String op = sc.nextLine().trim();

        double result;
        boolean valid = true;

        switch (op) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                    valid = false;
                    result = 0;
                } else {
                    result = num1 / num2;
                }
                break;

            default:
                System.out.println("Invalid operator");
                valid = false;
                result = 0;
        }

        if (valid) {
            System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        }

        sc.close();
    }

    private static double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine();
            try {
                return Double.parseDouble(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid numeric value.");
            }
        }
    }
}
