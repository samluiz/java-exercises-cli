package samuel.luiz.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyList {
    Scanner sc;

    public MyList(Scanner sc) {
        this.sc = sc;
    }
    public void run(List<Integer> list) {
        int option;
        int index = -1;
        do {
            System.out.println("""
                [1] Add element
                [2] Remove element
                [0] Quit
                """);
            option = sc.nextInt();
            sc.nextLine();

            if (option != 0) {
                System.out.println("At which index?");
                index = sc.nextInt();
                sc.nextLine();
            }


            switch (option) {
                case 1 -> {
                    System.out.println("Which element do you wanna add?");
                    list.add(index, sc.nextInt());
                }
                case 2 -> list.remove(index);
                case 0 -> {
                    for (Integer i : list) {
                        System.out.print(i + " ");
                    }
                }
                default -> System.out.println("Try again");
            }
        } while (option != 0);
    }
}
