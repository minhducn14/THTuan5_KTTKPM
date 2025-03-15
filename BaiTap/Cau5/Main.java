package BaiTap.Cau5;

public class Main {
    public static void main(String[] args) {
        BorrowableBook basicBook = new BasicBorrowableBook("Java Core Book");

        System.out.println("Mượn sách cơ bản:");
        basicBook.borrow();

        System.out.println("\nMượn sách có gia hạn:");
        BorrowableBook extendedBook = new ExtendedBorrow(basicBook);
        extendedBook.borrow();

        System.out.println("\nMượn sách phiên bản đặc biệt và gia hạn:");
        BorrowableBook specialBook = new SpecialEditionBorrow(extendedBook);
        specialBook.borrow();
    }
}
