
public class Laptops implements Comparable<Laptops> {
    private String brand;
    private String color;

    public Laptops(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int compareTo(Laptops o) {
        return 0;
    }
}
