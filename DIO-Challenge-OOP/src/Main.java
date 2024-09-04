public class Main {
    public static void main(String[] args) throws Exception {
        
        Course course1 = new Course();
        course1.setTitle("Java Course");
        course1.setDescription("Java course description");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Java Course");
        course2.setDescription("Java course description");
        course2.setWorkload(8);
        
        System.out.println(course1);
        System.out.println(course2);

        Mentory mentory = new Mentory();
        mentory.setTitle("Java mentory");
        
    }
}
