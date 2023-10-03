package samuel.luiz.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    Scanner sc;

    public ExceptionHandling(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        try {
            System.out.println("Insert the X number:");
            int x = sc.nextInt();
            sc.nextLine();

            System.out.println("Insert the Y number:");
            int y = sc.nextInt();
            sc.nextLine();

            System.out.println(x + " / " + y + " = " + x / y);
        } catch (InputMismatchException e) {
            System.out.println("You have to insert two integers.");
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0.");
        }
    }
}
