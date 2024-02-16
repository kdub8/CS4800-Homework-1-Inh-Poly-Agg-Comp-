/**
 * Represents a textbook with a title, author, and publisher.
 */
/** @author Kevin */
public class Textbook {
    private String title;
    private String author;
    private String publisher;

    /**
     * Constructs a new Textbook object.
     * 
     */
    public Textbook() {

    }

    /**
     * Sets the title of the textbook.
     * 
     * @param title the new title of the textbook
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the title of the textbook.
     * 
     * @return the title of the textbook
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the author of the textbook.
     * 
     * @param author the new author of the textbook
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the author of the textbook.
     * 
     * @return the author of the textbook
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the publisher of the textbook.
     * 
     * @param publisher the new publisher of the textbook
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Gets the publisher of the textbook.
     * 
     * @return the publisher of the textbook
     */
    public String getPublisher() {
        return publisher;
    }
}
