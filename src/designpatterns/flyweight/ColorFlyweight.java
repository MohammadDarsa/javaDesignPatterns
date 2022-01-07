package designpatterns.flyweight;

import java.util.HashMap;

public class ColorFlyweight {
    private HashMap<String, Color> hashMap;

    public ColorFlyweight() {
        hashMap = new HashMap<>();
    }

    public void addColor(String key, Color color) {
        hashMap.put(key, color);
    }

    public Color getColor(String key) {
        return hashMap.get(key);
    }
}
