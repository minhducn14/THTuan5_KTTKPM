package BaiTap.Cau5;

public class BasicBorrowableBook implements BorrowableBook {
    private String title;

    public BasicBorrowableBook(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        System.out.println("Mượn sách: " + title);
    }
}
