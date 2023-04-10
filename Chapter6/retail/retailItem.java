/*Write a class named RetailItem that holds data about an item in a retail store. The class
should have the following fields:

    • description. The description field references a String object that holds a brief description of the item.
    • unitsOnHand. The unitsOnHand field is an int variable that holds the number of units currently in inventory.
    • price. The price field is a double that holds the item’s retail price.

Write a constructor that accepts arguments for each field, appropriate mutator methods that store 
values in these fields, and accessor methods that return the values in these fields. Once you have 
written the class, write a separate program that creates three RetailItem objects and stores the 
following data in them:

                Desc.           UoH         Price
    Item #1:    Jacket          12          59.95
    Item #2:    Des. Jeans      40          34.95
    Item #3:    Shirt           20          24.95
 */
public class retailItem {
    //Create private variables
    private String description;
    private int unitsOnHand;
    private double unitPrice;

    public retailItem(String desc, int units, double price) {
        description = desc;
        unitsOnHand = units;
        unitPrice = price;
    }

    public void setDesc(String desc) {
        description = desc;
    }

    public void setUnits(int units) {
        unitsOnHand = units;
    }

    public void setPrice(double price) {
        unitPrice = price;
    }

    public String getDesc() {
        return description;
    }

    public int getUnits() {
        return unitsOnHand;
    }

    public double getPrice() {
        return unitPrice;
    }
}
