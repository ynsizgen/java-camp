package oopIntro;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setId(2);
        product1.setName("Lenovo 213");
        product1.setDetail("16 gb ram");
        product1.setDiscount(10);
        product1.setUnitPrice(16000);

        System.out.println(product1.getUnitPriceAfterDiscount());

        Catagory catagory1 = new Catagory();

        catagory1.setId(1);
        catagory1.setName("İçecek");

    }

}
