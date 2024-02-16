// Driver class for testing the Course, Instructor, and Textbook classes.
/** @author Kevin */
public class Driver {
    /**
     * Main method to create instances of Instructor, Textbook, and Course classes,
     * and print their details.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String args[]) {

        Instructor instructor = new Instructor();
        instructor.setFirstName("Nima");
        instructor.setLastName("Davarpanah");
        instructor.setOfficeNumber("3-2636");
        Textbook textbook = new Textbook();
        textbook.setTitle("Clean Code");
        textbook.setAuthor("Robert Cecil Martin");
        textbook.setPublisher("Pearson");
        Course course = new Course();
        course.setCourseName("CS4800-01");
        course.setInstructor(instructor);
        course.setTextbook(textbook);

        // Printing the details of the course.
        course.print();
        // Printing a new line for better readability.
        System.out.println();

        Instructor instructor2 = new Instructor();
        instructor.setFirstName("Kevin");
        instructor.setLastName("Wong");
        instructor.setOfficeNumber("5-8888");
        Textbook textbook2 = new Textbook();
        textbook2.setTitle("Muay Thai - The Art of 8 Limbs");
        textbook2.setAuthor("Suphachai Saenchai Saepong");
        textbook2.setPublisher("Muay Thai 101 and Co.");
        Course course2 = new Course();
        course2.setCourseName("MT1000 Introduction to Muay Thai");
        course2.setInstructor(instructor2);
        course2.setTextbook(textbook2);

        // Printing the details of the second course.
        course2.print();

    }
}
