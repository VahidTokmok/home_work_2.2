public class Heather extends Appliances{

    private String type;
    private int area;

    public Heather(String brand, int model, Color color, int price, String type, int area) {
        super(brand, model, color, price);
        this.type = type;
        this.area = area;
    }

    @Override
    public void print() {
       super.print();
        System.out.println("type: " + type + "\nheating area: " + area);
    }
}
