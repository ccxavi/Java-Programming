import java.util.*;

public class Calculator {
    public void Addition(double a , double b) {
    
        System.out.println(" ");
        double sum = a + b;
        
        System.out.println("The sum of " + a + " and " + b + " is " + String.format("%.2f", sum) + ".");
    }

    public void Subtraction(double a , double b) {

        System.out.println(" ");
        double diff = a - b;
    
        System.out.println("The difference of " + a + " and " + b + " is " + String.format("%.2f", diff) + ".");
    }

    public void Multiplication(double a , double b) {

        System.out.println(" ");
        double prod = a * b;
        
        System.out.println("The product of " + a + " and " + b + " is " + String.format("%.2f", prod) + ".");
    }

    public void Division(double a , double b) {    
        
        System.out.println(" ");
        double quo = a / b;
        
        System.out.println("The quotient of " + a + " and " + b + " is " + String.format("%.2f", quo) + ".");
    }

    public void Remainder(double a , double b) {    
        
        System.out.println(" ");
        double mod = a % b;
        
        System.out.println("The remainder of " + a + " and " + b + " is " + String.format("%.2f", mod) + ".");
    }
    
    public void SquareRoot(double a) {    
        
        System.out.println(" ");
        double sqrt = a * a;
        
        System.out.println("The square root of " + a + " is " + String.format("%.2f", sqrt) + ".");
    }

    public void CubeRoot(double a) {    
        
        System.out.println(" ");
        double cbrt = a * a * a;
        
        System.out.println("The cube root of " + a + " is " + String.format("%.2f", cbrt) + ".");
    }

    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        Calculator obj1 = new Calculator();
        int num1, num2;

        System.out.println(" ");
        System.out.println("Hello, I am Javi. Your Simple Java Calculator!");
        System.out.println(" ");
        System.out.println("Operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Getting the Remainder");
        System.out.println("6. Square Root");
        System.out.println("7. Cube Root");
        
        System.out.println (" ");
        System.out.print("Enter ONLY the number of your choice: ");
        int operation = input.nextInt();

        switch (operation) {
            case 1:
                System.out.println(" ");
                System.out.println("Addition");
                System.out.print("Enter First Value: ");
                num1 = input.nextInt();
                System.out.print("Enter Second Value: ");
                num2 = input.nextInt();
                obj1.Addition(num1 , num2);
                break;
            case 2:
                System.out.println(" ");
                System.out.println("Subtraction");
                System.out.print("Enter First Value: ");
                num1 = input.nextInt();
                System.out.print("Enter Second Value: ");
                num2 = input.nextInt();
                obj1.Subtraction(num1 , num2);
                break;
            case 3:
                System.out.println(" ");
                System.out.println("Multiplication");
                System.out.print("Enter First Value: ");
                num1 = input.nextInt();
                System.out.print("Enter Second Value: ");
                num2 = input.nextInt();
                obj1.Multiplication(num1 , num2);
                break;
            case 4:
                System.out.println(" ");
                System.out.println("Division");
                System.out.print("Enter First Value: ");
                num1 = input.nextInt();
                System.out.print("Enter Second Value: ");
                num2 = input.nextInt();                
                obj1.Division(num1 , num2);
                break;
            case 5:
                System.out.println(" ");
                System.out.println("Getting the Remainder");
                System.out.print("Enter First Value: ");
                num1 = input.nextInt();
                System.out.print("Enter Second Value: ");
                num2 = input.nextInt();    
                obj1.Remainder(num1 , num2);
                break;
            case 6:
                System.out.println(" ");
                System.out.println("Square Root");
                System.out.print("Enter a Value: ");
                num1 = input.nextInt();
                obj1.SquareRoot(num1);
                break;
            case 7:
                System.out.println(" ");
                System.out.println("Cube Root");
                System.out.print("Enter a Value: ");
                num1 = input.nextInt();
                obj1.CubeRoot(num1);
                break;
            default:
                System.out.println (" ");
                System.out.println ("Please enter 1-7 ONLY!");
        }
    }
}