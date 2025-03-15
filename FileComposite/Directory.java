import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemNode {
    private List<FileSystemNode> children;

    public Directory(String name) {
        super(name);
        this.children = new ArrayList<>();
    }

    public void add(FileSystemNode node) {
        children.add(node);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Directory: " + name);
        for (FileSystemNode node : children) {
            node.display(indent + "    ");
        }
    }
}
