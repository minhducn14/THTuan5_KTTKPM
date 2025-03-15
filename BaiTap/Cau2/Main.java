package BaiTap.Cau2;

public class Main {
    public static void main(String[] args) {
        BookFactory paperFactory = new PaperBookFactory();
        Book paperBook = paperFactory.createBook("Java Design Patterns");

        BookFactory eBookFactory = new EBookFactory();
        Book ebook = eBookFactory.createBook("Mastering Java");

        BookFactory audioFactory = new AudioBookFactory();
        Book audioBook = audioFactory.createBook("Learn Java by Audio");

        paperBook.displayInfo();
        ebook.displayInfo();
        audioBook.displayInfo();
    }
}
