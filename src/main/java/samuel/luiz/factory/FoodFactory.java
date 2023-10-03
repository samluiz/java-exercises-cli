package samuel.luiz.factory;

public class FoodFactory {

    public Food getFood(String food) {
        if (food.equals("pizza")) {
            return new Pizza();
        } else if (food.equals("cake")) {
            return new Cake();
        }
        return null;
    }
}
