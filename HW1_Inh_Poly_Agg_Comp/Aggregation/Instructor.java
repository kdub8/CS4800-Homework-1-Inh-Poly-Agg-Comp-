public class Instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;

    public Instructor(String fname, String lname, String officeNum) {
        this.firstName = fname;
        this.lastName = lname;
        this.officeNumber = officeNum;
    }

    public void setFirstName(String fname) {
        this.firstName = fname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lname) {
        this.lastName = lname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setOfficeNumber(String num) {
        this.officeNumber = num;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }
}
