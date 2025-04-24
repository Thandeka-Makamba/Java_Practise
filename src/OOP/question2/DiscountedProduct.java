package OOP.question2;

public class DiscountedProduct extends Product{
    private double discountPercentage;

    DiscountedProduct(String name, double price, double discount) {
        super(name, price);
        discountPercentage = discount;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discount) {
        if (discount < 0.0) {
            throw new IllegalArgumentException("Discount percentage must be positive or zero");
        } else {
            discountPercentage = discount;
        }
    }

    public void applyDiscount() {
        double newPrice = this.getPrice() - (this.getPrice() * discountPercentage);
        this.setPrice(newPrice);
    }
}
