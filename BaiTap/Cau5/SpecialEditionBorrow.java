package BaiTap.Cau5;

public class SpecialEditionBorrow extends BookDecorator {
    public SpecialEditionBorrow(BorrowableBook book) {
        super(book);
    }

    @Override
    public void borrow() {
        super.borrow();
        System.out.println("-> Mượn phiên bản đặc biệt có chữ ký tác giả.");
    }
}
