import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<Folder> subFolders;
    private List<File> files;

    public Folder(String name) {
        this.name = name;
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void removeSubFolder(Folder folderToRemove) {
        subFolders.remove(folderToRemove);

        for (File file : folderToRemove.files) {
            this.files.remove(file);
        }
        

        for (Folder subFolder : folderToRemove.subFolders) {
            this.removeSubFolder(subFolder);
        }

    }

    public void setSubFolders(List<Folder> subFolders) {
        this.subFolders = subFolders;
    }

    public void printAllSubFolders() {

        for (Folder subFolder : this.subFolders) {
            System.out.println(subFolder.getName());
        }

    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeFile(File file) {
        files.remove(file);
    }


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