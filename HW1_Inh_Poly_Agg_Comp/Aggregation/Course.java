public class Course {
    private Instructor instructor;
    private Textbook textbook;
    private String courseName;

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void print() {
        System.out.println("Course name: " + courseName);
        System.out.println("Instructor First Name: " + instructor.getFirstName());
        System.out.println("Instructor Last Name: " + instructor.getLastName());
        System.out.println("Textbook Title: " + textbook.getTitle());
        System.out.println("Textbook Author: " + textbook.getAuthor());
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

}
