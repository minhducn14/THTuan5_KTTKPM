package BaiTap.Cau5;

public class ExtendedBorrow extends BookDecorator {
    public ExtendedBorrow(BorrowableBook book) {
        super(book);
    }

    @Override
    public void borrow() {
        super.borrow();
        System.out.println("-> Mượn với thời gian gia hạn.");
    }
}
