
/**
 * Represents a course with an instructor and textbook.
 */

/** @author Kevin */
public class Course {
    private Instructor instructor;
    private Textbook textbook;
    private String courseName;

    /**
     * Constructs a new Course object.
     */
    public Course() {

    }

    /**
     * Prints information about the course, including course name, instructor's
     * first and last name, textbook title, and author.
     */
    public void print() {
        System.out.println("Course name: " + courseName);
        System.out.println("Instructor First Name: " + instructor.getFirstName());
        System.out.println("Instructor Last Name: " + instructor.getLastName());
        System.out.println("Textbook Title: " + textbook.getTitle());
        System.out.println("Textbook Author: " + textbook.getAuthor());
    }

    /**
     * Sets the name of the course.
     *
     * @param courseName The name of the course
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Gets the name of the course.
     *
     * @return The name of the course
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets the instructor of the course.
     *
     * @param instructor The instructor of the course
     */
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    /**
     * Gets the instructor of the course.
     *
     * @return The instructor of the course
     */
    public Instructor getInstructor() {
        return instructor;
    }

    /**
     * Sets the textbook used in the course.
     *
     * @param textbook The textbook used in the course
     */
    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    /**
     * Gets the textbook used in the course.
     *
     * @return The textbook used in the course
     */
    public Textbook getTextbook() {
        return textbook;
    }
}
