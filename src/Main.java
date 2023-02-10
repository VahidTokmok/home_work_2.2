public class Main {

    public static void main(String[] args) {
        Printable[] printables = {createObject("Fridge"),
                createObject("TV"), createObject("Heather")};

        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
            System.out.println();
        }
    }


    public static Printable createObject(String className) {
        switch (className) {
            case "Fridge":
                Fridge fridge = new Fridge("Beko", 001, Color.WHITE, 15000, 200, 2);
                return fridge;
            case "TV":
                TV tv = new TV("Samsung", 111, Color.BLACK, 10000, 80.5, true);
                return tv;
            case "Heather":
                Heather heather = new Heather("Eurolux", 5, Color.BEIGE, 500, "Oil", 15);
                return heather;
        }
        return null;
    }
}