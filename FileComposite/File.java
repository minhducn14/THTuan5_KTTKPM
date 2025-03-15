public class File extends FileSystemNode {
    private String data;
    private int size;

    public File(String name, String data) {
        super(name);
        this.data = data;
        this.size = data.length();
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "File: " + name + " (Size: " + size + " bytes)");
    }
}
