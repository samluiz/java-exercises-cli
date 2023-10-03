package samuel.luiz.factory;

import java.util.Scanner;

public class FactoryImpl {
    Scanner sc;

    public FactoryImpl(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("Pizza or cake?");
        String food = sc.nextLine().toLowerCase();
        if (!food.equals("pizza") && !food.equals("cake")) {
            System.out.println("We don't have this on our menu...");
            System.exit(1);
        }
        FoodFactory factory = new FoodFactory();
        Food foodInstance = factory.getFood(food);
        System.out.println("The factory returned class " + foodInstance.getClass().getSimpleName());
        System.out.println("Someone ordered " + foodInstance.getType() + "!");
    }
}
