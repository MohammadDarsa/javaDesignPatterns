package designpatterns.flyweight;

public class Color {
    private String colorName;
    private String hex;

    public Color(String colorName, String hex) {
        this.colorName = colorName;
        this.hex = hex;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    @Override
    public String toString() {
        return "Color{" +
                "colorName='" + colorName + '\'' +
                ", hex='" + hex + '\'' +
                '}';
    }
}
