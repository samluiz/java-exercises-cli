package samuel.luiz.interfaces;

import java.util.Scanner;

public class CalculatorImpl {
    AdvancedArithmetic calc = new MyCalculator();
    Scanner sc;

    public CalculatorImpl(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("Insert a integer number from 0 to 1000:");
        int num = sc.nextInt();
        sc.nextLine();

        int sum = calc.divisor_sum(num);

        System.out.println("The sum of the divisors of " + num + " is equal to " + sum);

        if (num != 0 && num * 2 == sum) {
            System.out.println("It's a perfect number!");
        }
    }
}
