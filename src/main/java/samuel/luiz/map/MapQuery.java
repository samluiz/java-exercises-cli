package samuel.luiz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapQuery {

    private Scanner sc;

    public MapQuery(Scanner sc) {
        this.sc = sc;
    }

    Map<String, String> people = new HashMap<>();

    public void run() {
        System.out.println("Select an option:\n[1] Add person\n[2] Search person\n[0] Exit");
        if (sc.hasNextInt()) {
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1 -> addPerson();
                case 2 -> searchPerson();
                case 0 -> System.out.println("Leaving...");
                default -> System.out.println("Invalid option. Try again");
            }
        } else {
            System.out.println("Invalid value. Try again");
        }
    }

    public void addPerson() {
        System.out.println("Enter the name of the person:");
        String name = sc.nextLine();
        System.out.println("Enter the phone number of the person:");
        String phone = sc.nextLine();
        people.put(name, phone);
        run();
    }

    public void searchPerson() {
        String answer = "";
        do {
            System.out.println("Enter the name of the person:");
            String name = sc.nextLine();
            if (people.containsKey(name)) {
                System.out.println(name + "=" + people.get(name) + "\n");
            } else {
                System.out.println("Not found\n");
            }
            System.out.println("Do you wanna search another person? \nYes/No");
            answer = sc.nextLine().toUpperCase();
        } while (answer.contains("YES"));
        run();
    }

}
