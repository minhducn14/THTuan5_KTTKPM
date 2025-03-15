package BaiTap.Cau2;

public class EBookFactory extends BookFactory {
    public Book createBook(String title) {
        return new EBook(title);
    }
}
