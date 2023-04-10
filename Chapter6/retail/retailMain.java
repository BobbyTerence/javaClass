public class retailMain {
    public static void main(String[] args) {
        //Create three retailItem objects with the given values to initialize it
        retailItem obj1 = new retailItem("Jacket", 12, 59.95);
        retailItem obj2 = new retailItem("Designer Jeans", 40, 34.95);
        retailItem obj3 = new retailItem("Shirt", 20, 24.95);

        System.out.printf("Info for Item 1: %s %d %.2f\n", obj1.getDesc(), obj1.getUnits(), obj1.getPrice());
        System.out.printf("Info for Item 1: %s %d %.2f\n", obj2.getDesc(), obj2.getUnits(), obj2.getPrice());
        System.out.printf("Info for Item 1: %s %d %.2f\n", obj3.getDesc(), obj3.getUnits(), obj3.getPrice());
    }
}
