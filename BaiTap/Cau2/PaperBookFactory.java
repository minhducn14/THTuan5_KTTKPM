package BaiTap.Cau2;

public class PaperBookFactory extends BookFactory {
    public Book createBook(String title) {
        return new PaperBook(title);
    }
}