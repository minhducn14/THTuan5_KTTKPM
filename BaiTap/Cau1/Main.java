package BaiTap.Cau1;

public class Main {
    public static void main(String[] args) {
        Library lib1 = Library.getInstance();
        Library lib2 = Library.getInstance();

        System.out.println("Library 1 hash: " + lib1.hashCode());
        System.out.println("Library 2 hash: " + lib2.hashCode());

        if (lib1 == lib2) {
            System.out.println("Library là Singleton (duy nhat).");
        } else {
            System.out.println("Library KHÔNG phải Singleton.");
        }
    }
}
