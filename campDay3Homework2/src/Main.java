import manager.InstructorManager;
import manager.StudentManager;
import manager.UserManager;
import model.Instructor;
import model.Student;
import model.User;


public class Main {
    public static void main(String[] args) {

        String[] coursesJoined={"Java React",".NET Angular"};

        //initialize a student = student1
        Student student1 = new Student(101,"Yunus İzgen","ÜN","yns@exp.com",
                                        "1234","Ankara",coursesJoined,true,"1234432112344321");

        //initialize a student = student2
        Student student2 = new Student(102,"İlhan","Kural","ilh@exp.com",
                "1234","Ankara",coursesJoined,false,"1234432112311111");

        //shows student1 and student2
        System.out.println(student1.getId()+" - "+student1.getFirstName()+" - " +student1.getSubscriptions());
        System.out.println(student2.getId()+" - "+student2.getFirstName()+" - " +student2.getSubscriptions());

        //initialize a instructor = instructor1
        Instructor instructor1 = new Instructor(201,"Engin","Demiroğ","engin@exp.com",
                                                "12345","Kral adam","999999999999");
        //show instructor1
        System.out.println(instructor1.getId()+" - " + instructor1.getFirstName() +" "+ instructor1.getLastName()+" - "+ instructor1.getProfile());

        //UserManager methods
        UserManager userManager = new UserManager();
        userManager.add(student1);
        userManager.add(student2);
        userManager.add(instructor1);

        userManager.update(student1);
        userManager.update(instructor1);

        //add all Users
        User[] users = {student1,student2,instructor1};
        userManager.addMultiple(users);

        //InstructorManager method
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.changeSalary(instructor1);

        //StudentManager method
        StudentManager studentManager = new StudentManager();
        studentManager.changeCardDetail(student1);
    }
}
