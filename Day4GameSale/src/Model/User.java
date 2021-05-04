package Model;

import java.time.LocalDate;
import java.util.Arrays;

public class User implements Entities {
    private long userId;
    private String firstName;
    private String lastName;
    private String nationalityId;
    private String email;
    private String password;
    private String[] cards;
    private LocalDate dateOfBirth;
    private Product[] ownedProducts;
    private double balance;

    public User() {
    }

    public User(long userId, String firstName, String lastName, String nationalityId, String email, String password, String[] cards, LocalDate dateOfBirth, Product[] ownedProducts, double balance) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
        this.email = email;
        this.password = password;
        this.cards = cards;
        this.dateOfBirth = dateOfBirth;
        this.ownedProducts = ownedProducts;
        this.balance = balance;
    }

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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

    public String[] getCards() {
        return this.cards;
    }

    public void setCards(String[] cards) {
        this.cards = cards;
    }

    public String getNationalityId() {
        return this.nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Product[] getOwnedProducts() {
        return this.ownedProducts;
    }

    public void setOwnedProducts(Product[] ownedProducts) {
        this.ownedProducts = ownedProducts;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalityId='" + nationalityId + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", cards=" + Arrays.toString(cards) +
                ", dateOfBirth=" + dateOfBirth +
                ", ownedProducts=" + Arrays.toString(ownedProducts) +
                ", balance=" + balance +
                '}';
    }
}
