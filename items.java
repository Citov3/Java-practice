import java.util.ArrayList;
//Item class with attributes name, price, and quantity
public class items {

    private String name;
    private double price;
    private int quantity;


//constructor for my items
    public items(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public static void main(String[] args) {
        
        //initialize array list of items
        ArrayList<items> itemlist = new ArrayList<>();

        //add items to the list
        itemlist.add(new items("apple", 2.99, 10));
        itemlist.add(new items ("mango" ,2.50, 30));


        System.out.println("Item List:");
        for(items items : itemlist) {
            System.out.println("Name: " + items.name + ", Price: " + items.price + ", Quantity: " + items.quantity);
        }

    }

}
