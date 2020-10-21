package FoodOrderingService;

public class SlickDatabase {
    Disk disk = new Disk();

    public void write(String key, String value) {
        if (value == null) {
            System.out.println("value cannot be null");
            return;
        }
        disk.write(key, value);
    }

    public String read(String key) {
        return disk.read(key);
    }
}