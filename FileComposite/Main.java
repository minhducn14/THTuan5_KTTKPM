public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("Root");

        File file1 = new File("File1.txt", "Hello world!");
        File file2 = new File("File2.txt", "Java programming");

        Directory subDir1 = new Directory("Documents");
        Directory subDir2 = new Directory("Images");

        File file3 = new File("Doc1.docx", "Report content...");
        File file4 = new File("Image1.png", "BinaryImageData");

        subDir1.add(file3);
        subDir2.add(file4);

        root.add(file1);
        root.add(file2);
        root.add(subDir1);
        root.add(subDir2);

        root.display("");
    }
}
