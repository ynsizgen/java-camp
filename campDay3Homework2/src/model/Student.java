package model;

import java.util.Arrays;

public class Student extends User{
    private String address;
    private String[] coursesJoined;
    private boolean subscriptions;
    private String cardDetail;

    public Student(){

    }

    public Student(long id, String firstName, String lastName, String email,
                   String password, String address, String[] coursesJoined,
                   boolean subscriptions, String cardDetail) {
        super(id, firstName, lastName, email, password);
        this.address = address;
        this.coursesJoined = coursesJoined;
        this.subscriptions = subscriptions;
        this.cardDetail = cardDetail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getCoursesJoined() {
        return coursesJoined;
    }

    public void setCoursesJoined(String[] coursesJoined) {
        this.coursesJoined = coursesJoined;
    }

    public boolean getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(Boolean subscriptions) {
        this.subscriptions = subscriptions;
    }

    public String getCardDetail() {
        return cardDetail;
    }

    public void setCardDetail(String cardDetail) {
        this.cardDetail = cardDetail;
    }

    @Override
    public String toString() {

        return "Student{" +
                "address='" + address + '\'' +
                ", coursesJoined=" + Arrays.toString(coursesJoined) +
                ", subscriptions=" + subscriptions +
                ", cardDetail='" + cardDetail + '\'' +
                '}';
    }
}
