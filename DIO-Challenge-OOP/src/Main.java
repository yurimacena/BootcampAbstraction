import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Course course1 = new Course();
        course1.setTitle("Java Course");
        course1.setDescription("Java course description");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("JavaScript Course");
        course2.setDescription("JavaScript course description");
        course2.setWorkload(8);
        
        Mentory mentory = new Mentory();
        mentory.setTitle("Java mentory");
        mentory.setDescription("Java mentory description");
        mentory.setDate(LocalDate.now());   

        /*System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentory);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Bootcamp Java Developer description");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentory);

        Dev devYuri = new Dev();
        devYuri.setName("Yuri");
        devYuri.enrollBootcamp(bootcamp);
        System.out.println("Enrolled contents Yuri: " + devYuri.getEnrolledContents());
        
        devYuri.moveForward();
        devYuri.moveForward();
        System.out.println("-");
        System.out.println("Enrolled contents Yuri: " + devYuri.getEnrolledContents());
        System.out.println("Completed contents Yuri: " + devYuri.getCompletedContents());
        System.out.println("XP: " + devYuri.calculateXp());


        System.out.println("=========");

        Dev devJohn = new Dev();
        devJohn.setName("John");
        devJohn.enrollBootcamp(bootcamp);
        System.out.println("Enrolled contents John: " + devJohn.getEnrolledContents());
        
        devJohn.moveForward();
        System.out.println("-");
        System.out.println("Enrolled contents John: " + devJohn.getEnrolledContents());
        System.out.println("Completed contents John: " + devJohn.getCompletedContents());
        System.out.println("XP: " + devJohn.calculateXp());
    }
}
