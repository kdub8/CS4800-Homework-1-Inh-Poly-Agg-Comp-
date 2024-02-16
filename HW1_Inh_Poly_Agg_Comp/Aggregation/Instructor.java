/**
 * Represents an instructor with a first name, last name, and office number.
 */

/** @author Kevin */
public class Instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;

    /**
     * Constructs an Instructor object.
     * 
     */
    public Instructor() {
    }

    /**
     * Sets the first name of the instructor.
     *
     * @param fname The first name to set.
     */
    public void setFirstName(String fname) {
        this.firstName = fname;
    }

    /**
     * Gets the first name of the instructor.
     *
     * @return The first name of the instructor.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the last name of the instructor.
     *
     * @param lname The last name to set.
     */
    public void setLastName(String lname) {
        this.lastName = lname;
    }

    /**
     * Gets the last name of the instructor.
     *
     * @return The last name of the instructor.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the office number of the instructor.
     *
     * @param num The office number to set.
     */
    public void setOfficeNumber(String num) {
        this.officeNumber = num;
    }

    /**
     * Gets the office number of the instructor.
     *
     * @return The office number of the instructor.
     */
    public String getOfficeNumber() {
        return officeNumber;
    }

}
