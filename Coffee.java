class CoffeeOrder{
    String size;
    double price;

    //constructor
    CoffeeOrder(String size, double price){
        this.size = size;
        this.price = price;
    }

    void display(){
        System.out.println(" Size:" + size);
        System.out.println("Price:" + price);
    }
}

public class Coffee{
    public static void main(String[] args) {
        CoffeeOrder order1 = new CoffeeOrder("small", 100);

        CoffeeOrder order2 = new CoffeeOrder("large", 150);

        System.out.println("Display Details");
        order1.display();
        System.out.println("---------------");
        order2.display();

        
    }
}
