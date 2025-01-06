import java.util.Scanner;

public class Calculator{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Welcome to Calculator.");
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();
		
	 	System.out.println("Enter choice.");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		int choice = sc.nextInt();
		double result;

		switch(choice){
		case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            	case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
               
          	default:
                System.out.println("Invalid choice. Please try again.");
		}

                sc.close();
        }

        public static double add(double num1, double num2) {
                return num1 + num2;
        }
	public static double subtract(double num1, double num2) {
                return num1 - num2;
        }

}