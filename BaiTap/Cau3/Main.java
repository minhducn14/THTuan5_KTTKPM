package BaiTap.Cau3;

import java.util.List;

import BaiTap.Cau2.AudioBook;
import BaiTap.Cau2.Book;
import BaiTap.Cau2.EBook;
import BaiTap.Cau2.PaperBook;

public class Main {
    public static void main(String[] args) {
        Library library = Library.getInstance();
        library.addBook(new PaperBook("Java Basics"));
        library.addBook(new EBook("Design Patterns in Java"));
        library.addBook(new AudioBook("Advanced Java"));
        library.addBook(new PaperBook("PHP Basics"));
        library.addBook(new EBook("Design Patterns in PHP"));
        library.addBook(new AudioBook("Advanced PHP"));
        BookSearchContext context = new BookSearchContext();
        context.setStrategy(new SearchByTitle());
        List<Book> results = context.search("Java");

        System.out.println("Ket qua tim kiem tu khoa 'Java':");
        for (Book book : results) {
            book.displayInfo();
        }
    }
}
