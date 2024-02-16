
public class Driver {
    public static void main(String args[]) {
        Folder php_demo1 = new Folder("php_demo1");
        Folder SourceFiles = new Folder("Source Files");
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        Folder IncludePath = new Folder("Include Path");
        Folder RemoteFiles = new Folder("Remote Files");

        File htaccess = new File(".htaccess");
        File htrouterphp = new File(".htrouter.php");
        File indexhtml = new File("index.html");

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

        SourceFiles.removeSubFolder(app);

        php_demo1.print();

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Deleting public folder and printing out...");
        System.out.println("---------------------------------------------------------------------------\n");

        SourceFiles.removeSubFolder(publicFolder);

        php_demo1.print();

    }
}
