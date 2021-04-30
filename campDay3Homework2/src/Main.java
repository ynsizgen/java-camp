import manager.InstructorManager;
import manager.StudentManager;
import manager.UserManager;
import model.Instructor;
import model.Student;


public class Main {
    public static void main(String[] args) {

        String[] coursesJoined={"Java React",".NET Angular"};

        Student student1 = new Student(101,"Yunus İzgen","ÜN","yns@exp.com",
                                        "1234","Ankara",coursesJoined,true,"1234432112344321");
        System.out.println(student1.getId()+" - "+student1.getFirstName()+" - " +student1.getSubscriptions());

        Instructor instructor1 = new Instructor(201,"Engin","Demiroğ","engin@exp.com",
                                                "12345","Kral adam","999999999999");
        System.out.println(instructor1.getId()+" - " + instructor1.getFirstName() +" "+ instructor1.getLastName()+" - "+ instructor1.getProfile());

        UserManager userManager = new UserManager();
        userManager.add(student1);
        userManager.add(instructor1);

        userManager.update(student1);
        userManager.update(instructor1);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.changeSalary(instructor1);

        StudentManager studentManager = new StudentManager();
        studentManager.changeCardDetail(student1);
    }
}
