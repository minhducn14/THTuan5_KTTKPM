package BaiTap.Cau3;

import java.util.List;

import BaiTap.Cau2.Book;

public interface SearchStrategy {
    List<Book> search(List<Book> books, String keyword);
}
