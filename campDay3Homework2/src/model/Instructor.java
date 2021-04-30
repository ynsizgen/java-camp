package model;

public class Instructor extends User{
    private String profile;
    private String salary;

    public Instructor() {
    }

    public Instructor(long id, String firstName, String lastName, String email, String password, String profile, String salary) {
        super(id, firstName, lastName, email, password);
        this.profile = profile;
        this.salary = salary;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "profile='" + profile + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
