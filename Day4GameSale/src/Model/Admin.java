package Model;

import java.util.Arrays;

public class Admin implements Entities {
    private long adminId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private double amountEarned;
    private Product[] products;

    public Admin() {
    }

    public Admin(long adminId, String firstName, String lastName, String email, String password, Double amountEarned, Product[] products) {
        this.adminId = adminId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.amountEarned = amountEarned;
        this.products = products;
    }

    public long getAdminId() {
        return this.adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getAmountEarned() {
        return this.amountEarned;
    }

    public void setAmountEarned(Double amountEarned) {
        this.amountEarned = amountEarned;
    }

    public Product[] getProducts() {
        return this.products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", amountEarned=" + amountEarned +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}