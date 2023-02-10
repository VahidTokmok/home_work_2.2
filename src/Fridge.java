public class Fridge extends Appliances{

    private int volume;
    private int sectionNumber;

    public Fridge(String brand, int model, Color color, int price, int volume, int sectionNumber) {
        super(brand, model, color, price);
        this.volume = volume;
        this.sectionNumber = sectionNumber;
    }

    @Override
    public void print() {
         super.print();
         System.out.println("volume: " + volume + "\nSection number: " + sectionNumber);
    }
}
