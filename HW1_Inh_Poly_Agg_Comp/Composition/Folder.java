
/**
 * Represents a folder in a file system.
 */
/** @author Kevin */
import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<Folder> subFolders;
    private List<File> files;

    /**
     * Constructs a new Folder object.
     */
    public Folder() {

    }

    /**
     * Sets the name of the folder and initializes sub-folders and files lists.
     *
     * @param name The name of the folder
     */
    public void setName(String name) {
        this.name = name;
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    /**
     * Gets the name of the folder.
     *
     * @return The name of the folder
     */
    public String getName() {
        return name;
    }

    /**
     * Adds a sub-folder to this folder.
     *
     * @param folder The sub-folder to add
     */
    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    /**
     * Removes a sub-folder from this folder.
     *
     * @param folderToRemove The sub-folder to remove
     */
    public void removeSubFolder(Folder folderToRemove) {
        subFolders.remove(folderToRemove);

        for (File file : folderToRemove.files) {
            this.files.remove(file);
        }

        for (Folder subFolder : folderToRemove.subFolders) {
            this.removeSubFolder(subFolder);
        }

    }

    /**
     * Sets the list of sub-folders for this folder.
     *
     * @param subFolders The list of sub-folders
     */
    public void setSubFolders(List<Folder> subFolders) {
        this.subFolders = subFolders;
    }

    /**
     * Prints the names of all sub-folders of this folder.
     */
    public void printAllSubFolders() {

        for (Folder subFolder : this.subFolders) {
            System.out.println(subFolder.getName());
        }

    }

    /**
     * Adds a file to this folder.
     *
     * @param file The file to add
     */
    public void addFile(File file) {
        files.add(file);
    }

    /**
     * Removes a file from this folder.
     *
     * @param file The file to remove
     */
    public void removeFile(File file) {
        files.remove(file);
    }

    /**
     * Prints the folder structure starting from this folder, including
     * sub-folders and files.
     */
    public void print() {
        System.out.println("Folder: " + name);

        System.out.println("\tSub-Folders of " + name + ":");
        for (Folder folder : subFolders) {
            System.out.print("\t");
            folder.print();
        }

        System.out.println("\tFiles of " + name + ":");

        for (File file : files) {
            System.out.println("\t\t- " + file.getName());
        }
        System.out.println();
    }
}