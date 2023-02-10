public class TV extends Appliances{

    private double diagonal;
    private boolean androidTv;

    public TV(String brand, int model, Color color, int price, double diagonal, boolean androidTv) {
        super(brand, model, color, price);
        this.diagonal = diagonal;
        this.androidTv = androidTv;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("diagonal: " + diagonal + "\nAndroid TV: " + androidTv);
    }
}
