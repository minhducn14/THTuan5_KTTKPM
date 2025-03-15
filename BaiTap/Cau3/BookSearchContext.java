package BaiTap.Cau3;

import java.util.List;

import BaiTap.Cau2.Book;

public class BookSearchContext {
    private SearchStrategy strategy;

    public void setStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Book> search(String keyword) {
        return strategy.search(Library.getInstance().getBooks(), keyword);
    }
}
