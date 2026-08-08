import java.util.Scanner;
import java.util.InputMismatchException;

public class InputExceptionExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");

            int age = sc.nextInt();

            System.out.println("Age: " + age);
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid number");
        }
    }
}