package BaiTap.Cau2;

public class AudioBookFactory extends BookFactory {
    public Book createBook(String title) {
        return new AudioBook(title);
    }
}