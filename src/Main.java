import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Calculate = true;
        while (Calculate) {
            System.out.println("Basic Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an operation (1-5): ");

            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Exisiting calculator. Goodbye!");
                break;
            }
            System.out.println("enter the first number");
            double number1 = scanner.nextDouble();
            System.out.println("enter the second number");
            double number2 = scanner.nextDouble();
            switch (choice) {
                case 1:
                    System.out.println("Result:"+add(number1,number2));
                    break;
                case 2:
                    System.out.println("Result:"+subtract(number1,number2));
                    break;
                case 3:
                    System.out.println("Result:"+multiply(number1,number2));
                    break;
                case 4:
                    try {
                        System.out.println("Result:" + divise(number1, number2));
                    }catch (ArithmeticException e){
                        System.out.println("Error : " +e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalide choice . Please select a valid option ");
            }
        }
        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a*b;
    }

    public static double divise(double a, double b) {
        if(b==0) {
            throw new ArithmeticException("can not divide by zero");
        }
        return a/b;
    }
}