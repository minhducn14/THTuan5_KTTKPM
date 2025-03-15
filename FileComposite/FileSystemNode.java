import java.util.Date;

public abstract class FileSystemNode {
    protected String name;
    protected Date createdDate;

    public FileSystemNode(String name) {
        this.name = name;
        this.createdDate = new Date();
    }

    public String getName() {
        return name;
    }

    public abstract void display(String indent);
}
