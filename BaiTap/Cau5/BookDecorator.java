package BaiTap.Cau5;

public abstract class BookDecorator implements BorrowableBook {
    protected BorrowableBook book;

    public BookDecorator(BorrowableBook book) {
        this.book = book;
    }

    public void borrow() {
        book.borrow();
    }
}
