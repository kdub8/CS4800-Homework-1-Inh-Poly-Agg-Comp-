/**
 * Driver class for creating a file structure and testing folder operations.
 */
/** @author Kevin */
public class Driver {
    /**
     * Main method to create folders, files, and test folder operations.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String args[]) {
        Folder php_demo1 = new Folder();
        php_demo1.setName("php_demo1");
        Folder SourceFiles = new Folder();
        SourceFiles.setName("Source Files");
        Folder phalcon = new Folder();
        phalcon.setName(".phalcon");
        Folder app = new Folder();
        app.setName("app");
        Folder config = new Folder();
        config.setName("config");
        Folder controllers = new Folder();
        controllers.setName("controllers");
        Folder library = new Folder();
        library.setName("library");
        Folder migrations = new Folder();
        migrations.setName("migrations");
        Folder models = new Folder();
        models.setName("models");
        Folder views = new Folder();
        views.setName("views");
        Folder cache = new Folder();
        cache.setName("cache");
        Folder publicFolder = new Folder();
        publicFolder.setName("public");
        Folder IncludePath = new Folder();
        IncludePath.setName("Include Path");
        Folder RemoteFiles = new Folder();
        RemoteFiles.setName("Remote Files");

        File htaccess = new File();
        htaccess.setName(".htaccess");
        File htrouterphp = new File();
        htrouterphp.setName(".htrouter.php");
        File indexhtml = new File();
        indexhtml.setName("index.html");

        // Adding subfolders and files to folders
        php_demo1.addSubFolder(SourceFiles);
        SourceFiles.addSubFolder(phalcon);
        SourceFiles.addSubFolder(app);
        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);
        SourceFiles.addSubFolder(cache);
        SourceFiles.addSubFolder(publicFolder);
        SourceFiles.addFile(htaccess);
        SourceFiles.addFile(htrouterphp);
        SourceFiles.addFile(indexhtml);
        php_demo1.addSubFolder(IncludePath);
        php_demo1.addSubFolder(RemoteFiles);

        php_demo1.print();

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Deleting app folder and printing out...");
        System.out.println("---------------------------------------------------------------------------\n");

        // Deleting a folder and printing the updated file structure
        SourceFiles.removeSubFolder(app);

        php_demo1.print();

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Deleting public folder and printing out...");
        System.out.println("---------------------------------------------------------------------------\n");

        // Deleting another folder and printing the final file structure
        SourceFiles.removeSubFolder(publicFolder);

        php_demo1.print();

    }
}
