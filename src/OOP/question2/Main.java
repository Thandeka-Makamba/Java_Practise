package OOP.question2;

public class Main {
    public static void main(String[] args) {
        Product hat = new Product("Hat", 100.0);
        Product jean = new DiscountedProduct("Jean", 200.0, 0.1);

        Product[] products = {hat, jean};
        for(Product item: products) {
            if (item instanceof DiscountedProduct) {
                ((DiscountedProduct) item).applyDiscount();
                System.out.println("Item: " + item.getName() + ", Price: R" + item.getPrice());
            } else {
                System.out.println("Item: " + item.getName() + ", Price: R" + item.getPrice());
            }
        }

    }
}
