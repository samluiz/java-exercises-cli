package samuel.luiz;

import samuel.luiz.abstractclass.AbstractImpl;
import samuel.luiz.array.Sum;
import samuel.luiz.exceptions.ExceptionHandling;
import samuel.luiz.factory.FactoryImpl;
import samuel.luiz.interfaces.CalculatorImpl;
import samuel.luiz.list.MyList;
import samuel.luiz.map.MapQuery;
import samuel.luiz.singleton.Singleton;
import samuel.luiz.superclass.MethodOverriding;
import samuel.luiz.twochars.TwoCharacters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Select a test:
                [1] Java map
                [2] Method overriding
                [3] Abstract class
                [4] Interface (sum of divisors)
                [5] Try-Catch Exception Handling
                [6] Array Sum
                [7] Two characters
                [8] Singleton pattern
                [9] Factory pattern
                [10] Java list
                """);
        int option = sc.nextInt();
        sc.nextLine();
         switch (option) {
                case 1 -> new MapQuery(sc).run();
                case 2 -> new MethodOverriding().run();
                case 3 -> new AbstractImpl().run();
                case 4 -> new CalculatorImpl(sc).run();
                case 5 -> new ExceptionHandling(sc).run();
                case 6 -> new Sum().run(new int[]{4, 5, 7, 3, 2});
                case 7 -> new TwoCharacters().run("beabeefeab");
                case 8 -> Singleton.getSingleInstance().run();
                case 9 -> new FactoryImpl(sc).run();
                case 10 -> new MyList(sc).run(new ArrayList<>(Arrays.asList(4, 7, 3, 5, 2)));
                default -> System.out.println("Invalid option.");
            }
    }
}