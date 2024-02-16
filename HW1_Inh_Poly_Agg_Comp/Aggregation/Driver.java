public class Driver {
    public static void main (String args[]) {

        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook = new Textbook("Clean Code", "Robert Cecil Martin", "Pearson");
        Course course = new Course("CS4800-01 Software Engineering",instructor,textbook);

        course.print();
        System.out.println();

        Instructor instructor2 = new Instructor("Kevin", "Wong", "5-8888");
        Textbook textbook2 = new Textbook("Muay Thai - The Art of 8 Limbs", "Suphachai Saenchai Saepong", "Muay Thai 101 and Co." );
        Course course2 = new Course("MT1000 Introduction to Muay Thai", instructor2, textbook2);

        course2.print();


    }
}
