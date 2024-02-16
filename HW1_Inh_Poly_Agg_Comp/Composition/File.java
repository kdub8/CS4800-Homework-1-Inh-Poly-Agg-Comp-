/**
 * Represents a file with a name.
 */
/** @author Kevin */
public class File {
    private String name;

    /**
     * Constructs a new File object.
     */
    public File() {

    }

    /**
     * Sets the name of the file.
     *
     * @param name The name of the file
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the file.
     *
     * @return The name of the file
     */
    public String getName() {
        return name;
    }

    /**
     * Prints information about the file, including its name.
     */
    public void print() {
        System.out.println("File: " + name);
    }
}
