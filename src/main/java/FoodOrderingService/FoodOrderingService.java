package FoodOrderingService;

public class FoodOrderingService {
    private SlickDatabase database;

    public FoodOrderingService() {
        database = new SlickDatabase();
    }

    public void order(String client, String food) {
        String id = orderId(food);
        if (id == null) {
            System.out.printf("Sorry, %s is not on the menu.\n", food);
            return;
        }
        database.write(client, id);
        System.out.printf("Food %s (%s) ordered by %s\n", food, id, client);
    }

    public void checkStatus(String client) {
        String id = database.read(client);
        if (id == null) {
            System.out.printf("Error: no order by %s\n", client);
            return;
        }
        System.out.printf("%s's order %s is ready for pickup!\n", client, foodName(id));
    }

    private String orderId(String foodName) {
        switch (foodName) {
            case "steak hamburger":
                return "A";
            case "seafood pasta":
                return "B";
            case "tomato soup":
                return "C";
        }
        return null;
    }

    private String foodName(String foodId) {
        switch (foodId) {
            case "A":
                return "steak hamburger";
            case "B":
                return "seafood pasta";
            case "C":
                return "tomato soup";
        }
        return null;
    }
}
