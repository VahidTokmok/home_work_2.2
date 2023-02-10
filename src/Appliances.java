public abstract class Appliances implements Printable {

    private String brand;
    private int model;
    private Color color;
    private int price;

    public Appliances(String brand, int model, Color color, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(getClass() + "\nBrand: " + getBrand() + "\nmodel: " + getModel() + "\ncolor: " + getColor() +
                "\nprise: " + getPrice());
    }
}
