package Model;

public class Product implements Entities {
    private long productId;
    private String productName;
    private double price;
    private double discount;

    public Product() {
    }

    public Product(long productId, String productName, double price, double discount) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.discount = discount;
    }

    public long getProductId() {
        return this.productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}