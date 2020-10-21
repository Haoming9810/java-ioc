package FoodOrderingService;

import java.util.HashMap;
import java.util.Map;

public class Disk {
    Map<String, String> disk = new HashMap<>();

    public void write(String key, String value) {
        if (value == null) {
            return;
        }
        disk.put(key, value);
    }

    public String read(String key) {
        return disk.get(key);
    }
}
